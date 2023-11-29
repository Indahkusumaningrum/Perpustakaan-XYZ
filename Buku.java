/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class Buku {
    
    private String judul;
    private String penulis;
    private String kode_ISBN;
    private boolean status;
    private static List<Buku> listBuku = new ArrayList<>();

    public Buku(String judul, String penulis, String kode_ISBN, boolean status) {
        this.judul = judul;
        this.penulis = penulis;
        this.kode_ISBN = kode_ISBN;
        this.status = status;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getKode_ISBN() {
        return kode_ISBN;
    }

    public void setKode_ISBN(String kode_ISBN) {
        this.kode_ISBN = kode_ISBN;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Buku buku = (Buku) o;
        return Objects.equals(judul, buku.judul) && Objects.equals(penulis, buku.penulis) && Objects.equals(kode_ISBN, buku.kode_ISBN) && Objects.equals(status, buku.status);
        
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(judul, penulis, kode_ISBN, status);
    }
    
//        @Override
//    public String toString() {
//        return "Buku{" +
//                "judul='" + judul + '\'' +
//                ", penulis='" + penulis + '\'' +
//                ", kode_ISBN='" + kode_ISBN + '\'' +
//                ", status=" + status +
//                '}';
//    }
    
        
    public void toView() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Penulis : " + this.penulis);
        System.out.println("Kode ISBN : " + this.kode_ISBN);
        System.out.println("Status : " + this.status + "\n");
    }
    
    
    public static void tambahBuku(Buku buku) {
        listBuku.add(buku);
        System.out.println("Buku " + buku.getJudul() + " berhasil ditambahkan!\n");
    }
    
    public static void hapusBuku(Buku buku) {
        listBuku.remove(buku);
        System.out.println("Buku " + buku.getJudul() + " berhasil dihapus!\n");
    }
    
public List<Buku> cariBuku(String kriteria) {
    List<Buku> hasilPencarian = new ArrayList<>();

    if (kriteria == null || kriteria.isEmpty()) {
        return hasilPencarian;
    }

    switch (kriteria) {
        case "judul":
            hasilPencarian = listBuku.stream().filter(buku -> buku.getJudul().equals(this.judul)).collect(Collectors.toList());
            break;
        case "kode_ISBN":
            hasilPencarian = listBuku.stream().filter(buku -> buku.getKode_ISBN().equals(this.kode_ISBN)).collect(Collectors.toList());
            break;
        case "penulis":
            hasilPencarian = listBuku.stream().filter(buku -> buku.getPenulis().equals(this.penulis)).collect(Collectors.toList());
            break;
        default:
            break;
    }
    return hasilPencarian;
}

        
    }

