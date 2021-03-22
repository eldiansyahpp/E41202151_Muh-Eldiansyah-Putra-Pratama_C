package tugas2minggu3;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas2Minggu3 {

    public static void main(String[] args) {
                
        int[] angka = new int[5];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < angka.length; i++){
            System.out.print("Masukan Angka ke-"+i+" : ");
            angka[i] = scan.nextInt();
        }
        
        System.out.println("Isi Array Angka : "+Arrays.toString(angka));
    }
    
}
