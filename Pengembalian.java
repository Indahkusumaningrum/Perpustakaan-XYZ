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
public class Pengembalian {
    
    
    private int id_transaksi;
    private Peminjaman peminjaman;
    private Date tgl_pengembalian;

    public Pengembalian(int id_transaksi, Peminjaman peminjaman, Date tgl_pengembalian) {
        this.id_transaksi = id_transaksi;
        this.peminjaman = peminjaman;
        this.tgl_pengembalian = tgl_pengembalian;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }

    public Date getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public void setTgl_pengembalian(Date tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }

    
    public void toView() {
  System.out.println("-----Pengembalian-----");
  System.out.println("ID Transaksi: " + this.id_transaksi);
  System.out.println("Anggota: " + this.peminjaman.getAnggota().getNama());
  System.out.println("Buku: " + this.peminjaman.getBuku().getJudul());
  System.out.println("Tgl Pengembalian: " + this.tgl_pengembalian);
}
}
