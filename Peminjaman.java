/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.Date;

/**
 *
 * @author User
 */
public class Peminjaman {
    
    private int id_transaksi;
    private Anggota anggota;
    private Buku buku;
    private Date tgl_peminjaman;
    private Date TglKembali;
    private int durasi;

    public Peminjaman(int id_transaksi, Anggota anggota, Buku buku, Date tgl_peminjaman, int durasi) {
        this.id_transaksi = id_transaksi;
        this.anggota = anggota;
        this.buku = buku;
        this.tgl_peminjaman = tgl_peminjaman;
        this.durasi = durasi;
    }

    Peminjaman() {
        
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Date getTgl_peminjaman() {
        return tgl_peminjaman;
    }

    public void setTgl_peminjaman(Date tgl_peminjaman) {
        this.tgl_peminjaman = tgl_peminjaman;
    }

    public Date getTglKembali() {
        return TglKembali;
    }

    public void setTglKembali(Date TglKembali) {
        this.TglKembali = TglKembali;
    }
    
    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    
    
    public void toView() {
        System.out.println("\n-----Peminjaman-----" );
        System.out.println("ID Transaksi : " + this.id_transaksi);
        System.out.println("Anggota : " + this.getAnggota().getNama());
        System.out.println("Buku : " + this.getBuku().getJudul());
        System.out.println("Tgl Peminjaman : " + this.getTgl_peminjaman());
        System.out.println("Durasi : " + this.durasi);
    }
    
}
