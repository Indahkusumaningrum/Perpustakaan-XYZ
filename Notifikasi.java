/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class Notifikasi {
    

    private List<Peminjaman> peminjaman;

    public Notifikasi() {
        this.peminjaman = new ArrayList<>();
    }

    public void kirimNotifikasi() {
        for (Peminjaman peminjaman : peminjaman) {
            // Cek apakah masa peminjaman akan segera berakhir
            Date tglKembali = peminjaman.getTglKembali();
            Date tglSekarang = new Date();
            long selisihHari = (tglKembali.getTime() - tglSekarang.getTime()) / (1000 * 60 * 60 * 24);
            if (selisihHari <= 3) {
                // Buat objek `Pemberitahuan`
                Pemberitahuan pemberitahuan = new Pemberitahuan();
                pemberitahuan.setJudulBuku(peminjaman.getBuku().getJudul());
                pemberitahuan.setTglKembali(peminjaman.getTglKembali());

                // Kirim notifikasi
                pemberitahuan.kirimNotifikasi();
            }
        }
    }

}

class Pemberitahuan {

    private String judulBuku;
    private Date tglKembali;

    public Pemberitahuan() {
    }

    public Pemberitahuan(String judulBuku, Date tglKembali) {
        this.judulBuku = judulBuku;
        this.tglKembali = tglKembali;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }

    public void kirimNotifikasi() {
        System.out.println("Pemberitahuan masa peminjaman buku!!!");
        System.out.println("Judul Buku : " + this.judulBuku);
        System.out.println("Akan segera berakhir pada tanggal " + this.tglKembali);
        System.out.println("Untuk memperpanjang masa peminjaman, "
                + "\nAnda dapat menghubungi perpustakaan di nomor " + "081234567890");
    }

}