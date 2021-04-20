package latihan1minggu7;

public class Latihan1Minggu7 {

    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("Super Class");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();
        
        System.out.println("Sub Class");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TampilkanNilaiXY();
        
        subOb.z = 50;
        subOb.TampilanJumlah();
    }
    
}
