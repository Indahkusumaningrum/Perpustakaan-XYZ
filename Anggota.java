/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Anggota {
    
    private String nama;
    private int id_anggota;
    private String alamat;
    private List<Peminjaman> sejarah_peminjaman;

    public Anggota(String nama, int id_anggota, String alamat) {
        this.nama = nama;
        this.id_anggota = id_anggota;
        this.alamat = alamat;
        this.sejarah_peminjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(int id_anggota) {
        this.id_anggota = id_anggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<Peminjaman> getSejarah_peminjaman() {
        return sejarah_peminjaman;
    }

    public void setSejarah_peminjaman(List<Peminjaman> sejarah_peminjaman) {
        this.sejarah_peminjaman = sejarah_peminjaman;
    }

    public void tambahPeminjaman(Peminjaman peminjaman) {
        sejarah_peminjaman.add(peminjaman);
        System.out.println("\nBuku " + peminjaman.getBuku().getJudul() + " berhasil dipinjam oleh " + peminjaman.getAnggota().getNama());
    }

    public void hapusPeminjaman(Peminjaman peminjaman) {
        sejarah_peminjaman.remove(peminjaman);
        System.out.println("\nBuku " + peminjaman.getBuku().getJudul() + " berhasil dihapus/dikembalikan oleh " + peminjaman.getAnggota().getNama());;
    }

    
    public void toView() {
        System.out.println("Nama : " + this.nama);
        System.out.println("ID Anggota : " + this.id_anggota);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Sejarah Peminjaman : ");
        for (Peminjaman peminjaman : sejarah_peminjaman) {
            System.out.println("- ID Transaksi : " + peminjaman.getId_transaksi());
            System.out.println("- Anggota : " + peminjaman.getAnggota().getNama());
            System.out.println("- Buku : " + peminjaman.getBuku().getJudul());
            System.out.println("- Tgl Peminjaman : " + peminjaman.getTgl_peminjaman());
            System.out.println("- Durasi : " + peminjaman.getDurasi());
        }
    }
}
