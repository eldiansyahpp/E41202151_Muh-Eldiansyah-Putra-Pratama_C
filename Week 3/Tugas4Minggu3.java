package tugas4minggu3;

import java.util.Scanner;

public class Tugas4Minggu3 {
    public static void main(String[] args) {
        String nama;
        int sum = 0;
        int[] price = new int[6];
        System.out.println("-------------------------------------------");
        System.out.println("        Kharisma Agung Plaza < KAP >");
        System.out.println("         Promo Belanja Berhadiah");
        System.out.println("   Khusus Pembelanjaan 5 Barang Pertama");
        System.out.println("      Dengan harga inimum Rp 100000");
        System.out.println("-------------------------------------------");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan Nama Pembeli : ");
        nama = scan.nextLine();
        
        System.out.println("");
        
        for(int i = 1; i < price.length; i++){
            System.out.print("Masukan Angka ke-"+i+" : ");
            price[i] = scan.nextInt();
        }
        for( int num : price) {
            sum = sum+num;
        }
        System.out.println("Total harga pemebelian atas nama "+nama+" adalah "+sum);        
        System.out.println("");
        if(sum == 100000){
            System.out.println("Selamat....");
            System.out.println("Anda mendapatakan hadiah 1 buah mug cantik");
        }else{
            System.out.println("Ayo tambah belanjaan anda agar mendapat hadiah");
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("               Terima Kasih");
        System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
        
    }
    
}
