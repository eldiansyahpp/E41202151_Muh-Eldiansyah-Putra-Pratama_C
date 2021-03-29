package tugas2minggu4;

public class Tugas2Minggu4 {

    public static void main(String[] args) {
        int i = 0;
        
        System.out.println("       D0 While ");
        System.out.println("Kelipatan 2 antara 0-100");
        System.out.println("------------------------- ");
        
        do {
            if(i % 2 == 0){
                System.out.print(i+ " ");
            }
            i++;
        } while (i <= 100);
        
        System.out.println("");
        
        System.out.println("       D0 While ");
        System.out.println("Kuadrat 2 antara 0-100");
        System.out.println("------------------------- ");
        
        int j,pangkat;
        
        j = 0;
        pangkat=1;        
        do {
            pangkat*=2;
            System.out.print(pangkat+ " ");
            j++;
        } while (j <= 5);
    }
    
}
