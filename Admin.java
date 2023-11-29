/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.List;

/**
 *
 * @author User
 */
public class Admin {
    
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void tambahBuku(Buku buku) {
        Buku.tambahBuku(buku);
        System.out.println("Buku " + buku.getJudul() + " berhasil ditambahkan!\n");
    }

    public void hapusBuku(Buku buku) {
        Buku.hapusBuku(buku);
        System.out.println("Buku " + buku.getJudul() + " berhasil dihapus!\n");
    }

    public void tambahAnggota(Anggota anggota, List<Anggota> listAnggota) {
        listAnggota.add(anggota);
        System.out.println("Berhasil menambahkan member baru ke dalam list!\n");
}

    public void hapusAnggota(Anggota anggota, List<Anggota> listAnggota) {
        listAnggota.remove(anggota);
        System.out.println("Berhasil menghapus member ke dalam list!\n");
    }
   
}
