package tugas1minggu4;

import java.util.Scanner;

public class Tugas1Minggu4 {

    public static void main(String[] args) {
        System.out.println("  Bilangan Genap");
        System.out.println("-------------------");
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[2];
        
        System.out.print("Masukan batas awal = ");
        arr[0] = scan.nextInt();
        
        System.out.print("Masukan batas akhir = ");
        arr[1] = scan.nextInt();
        
        for(int i = arr[0];i <= arr[1]; i++){
            if(i % 2 == 0){
                System.out.println(i + "  ");
            }
        }
        
        System.out.println("-------------------");
    }
    
}
