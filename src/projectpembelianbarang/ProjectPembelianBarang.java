/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpembelianbarang;

import java.util.*;
/**
 *
 * @author asus
 */
public class ProjectPembelianBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;      //inisialisasi input menu makanan bertipe int
        int bayar = 0;  //inisialisasi total harga

        System.out.println(" ______________");      //menampilkan
        System.out.println("| Menu Makanan |");     //menu
        System.out.println(".--------------.");     //makanan
        System.out.println("|1. Ikan Asin  |");     //batagor
        System.out.println("|2. Nasi Goreng|");     //kupat tahu
        System.out.println("|3. Mie Setan  |");     //spaghetti
        System.out.println("|______________|");
        System.out.println("");

       
        //selama User menginput y, akan terus mengulang sampai User menginput t
        for(String b = "y"; b.equals("y") || b.equals("Y");){

        Scanner makanan = new Scanner(System.in);   //scanner
       
        System.out.print("Pilihan Menu : ");        //untuk menginput pilihan menu
        a = makanan.nextInt();

        //if pilihan 
        if(a == 1){
            int jumlah1;
            System.out.println("Ikan Asin   : 4000");
            System.out.print("Masukkan Jumlah Menu yang Mau Dipesan: ");
            jumlah1 = makanan.nextInt();
            bayar = bayar + 4000*jumlah1;
        }else if(a==2){
            int jumlah2;
            System.out.println("Nasi Goreng : 8000");
            System.out.print("Masukkan Jumlah Menu yang Mau Dipesan: ");
            jumlah2 = makanan.nextInt();
            bayar = bayar + 8000*jumlah2;
        }else if(a==3){
            int jumlah3;
            System.out.println("Mie Setan : 14000");
            System.out.print("Masukkan Jumlah Menu yang Mau Dipesan: ");
            jumlah3 = makanan.nextInt();
            bayar = bayar + 14000*jumlah3;
        }else{
            System.out.println("Mohon Maaf, Disini Menu Yang Ada Hanya Itu, Terimakasih");
           //jika salah memasukkan input selain 1-3
        }

        System.out.print("Apakah Anda Mau Memilih Menu Lain? (Y/T) ");
        //untuk menginput apakah ingin memilih lagi atau tidak
        b = makanan.next();

        }
        System.out.println(""); //Sekedar untuk memberi spasi
        int dibayar = (bayar);
        System.out.print("Total Harga: " + bayar); //menampilkan harga total yang harus dibayarkan user

        Scanner last=new Scanner (System.in);
        System.out.println("");
        int jumlahbayar, kembalian;
        System.out.print("Pembayaran: ");
        jumlahbayar = last.nextInt();
        if (jumlahbayar<bayar){
            int kurang;
            kurang = (jumlahbayar-bayar);
            System.out.print("Mohon Maaf, Uangnya Masih " + kurang); //
        }
        
        System.out.println("");
        kembalian = (jumlahbayar-bayar);
        System.out.print("Total Kembalian : " + kembalian + " Rupiah");
        

    }
    
}
