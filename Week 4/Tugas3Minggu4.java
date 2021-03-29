package tugas3minggu4;

import java.util.Scanner;

public class Tugas3Minggu4 {

    public static void main(String[] args) {
        int avg,max,min,i,arr[],jumlah,total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan banyaknya data nilai = ");
        jumlah = inputUser.nextInt();
        
        arr = new int[jumlah];
        total = 0;
        
        for(i = 0;i < jumlah; i++){
            System.out.print("Masukan data nilai ke-"+(i+1)+" : ");
            arr[i] = inputUser.nextInt();
            total = total + arr[i];
        }
        max = arr[0];
        min = arr[0];
        avg = total/jumlah;
        
        for(i = 0; i < jumlah; i++){
            if(arr[i]> max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Nilai Manimum = "+min);
        System.out.println("Nilai Maksimum = "+max);
        System.out.println("Nilai Rata-rata adalah = "+avg);
        }
    }
