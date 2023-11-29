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
public class PerpustakaanXYZ {
    private static List<Peminjaman> listPeminjaman;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Membuat objek book1,book 2 dan book3 pada class Buku
        Buku book1 = new Buku("Environmental Science", "Tyler Miller", "978-1-33-761275-3", true);
        Buku.tambahBuku(book1);
        book1.toView();
        Buku book2 = new Buku("Software Engineering", "Ian Sommerville", "978-0-13-394303-0", true);
        Buku.tambahBuku(book2);
        book2.toView();
        Buku book3 = new Buku("Data Structures & Algorithms in Pyhton", "Michael T. Goodrich", "978-1-118-29027-9", false);
        Buku.tambahBuku(book3);
        book3.toView(); 
        
        //Membuat objek admin baru
        Admin admin1 = new Admin("ilkomp23", "jaya123");
        
        //Menambahkan buku
        Buku book4 = new Buku("Harry Potter dan Batu Bertuah", "J.K. Rowling", "978-602-03-0231-7", true);
        admin1.tambahBuku(book4);
        
        //Menghapus buku
        admin1.hapusBuku(book4);
        
        //Membuat objek member baru
        Anggota member1 = new Anggota("Bayu", 1001, "Bandar Lampung");
        List<Anggota> DaftarAnggota = new ArrayList<>();
        
        //Menampilkan data member
        member1.toView();
    
        // Membuat daftar peminjaman
        List<Peminjaman> listPeminjaman = new ArrayList<>();
        
        Peminjaman peminjaman2 = new Peminjaman(2, member1, book2, new Date(), 8);
        member1.tambahPeminjaman(peminjaman2);
        peminjaman2.toView();
        
        //Menambahkan peminjaman
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setId_transaksi(1);
        peminjaman.setAnggota(new Anggota("Andi", 1, "Jl. Jendral Sudirman No. 1"));
        peminjaman.setBuku(new Buku("Harry Potter", "J.K. Rowling", "978-602-03-0231-7", true));
   
        Pengembalian pengembalian = new Pengembalian(1, peminjaman, new Date());
 
        pengembalian.toView();
        

        // Mebuat objek Notifikasi
        Pemberitahuan pemberitahuan = new Pemberitahuan("Environmental Science", new Date());

        // Send the notification
        pemberitahuan.kirimNotifikasi();
        
        Buku.hapusBuku(book3);
        
        System.out.println("--------MENCARI BUKU--------");
        Buku buku = Buku.cariBuku("Software Engineering");
        
        if (buku != null) {
            System.out.println("Buku ditemukan!");
            buku.toView();
        } else {
            System.out.println("Buku tidak ditemukan!");
        }
        
    }
    
}
