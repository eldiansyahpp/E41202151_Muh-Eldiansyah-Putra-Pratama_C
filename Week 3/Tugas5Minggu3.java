package tugas5minggu3;

import java.util.Scanner;

public class Tugas5Minggu3 {

    public static void main(String[] args) {
        String nama;
        char kode;
        String order;
        
        String[] menu = {"Soft drinks","Mix juice","Nescafe","Soda milk","Tea"};
        
        System.out.println("    CAFE CERIA");
        System.out.println("   ANEKA MINUMAN");
        System.out.println("---------------------");
        System.out.println("   SPECIAL MENU:");
        System.out.println("1. "+menu[0]);
        System.out.println("2. "+menu[1]);
        System.out.println("3. "+menu[2]);
        System.out.println("4. "+menu[3]);
        System.out.println("5. "+menu[4]);
        System.out.println("---------------------");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan Nama Pembeli : ");
        nama = scan.nextLine();
        
        System.out.print("Silahkan masukan pilihan anda : ");
        kode = scan.next().charAt(0);

        switch (kode){
            case '1':
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case '2':
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case '3':
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case '4':
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case '5':
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Maaf pesanan tidak terdaftar");
        }
        
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih "+nama+" telah berkunjung dicafe ceria");
    }
    
}
