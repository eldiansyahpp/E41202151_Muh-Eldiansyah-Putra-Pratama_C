package latihan2minggu7;

public class Orang {
    private String nama;
    private double tinggi;
    private double berat;
    
    public Orang (String nama, double tinggi, double berat){
        this.nama = nama;
        this.berat = berat;
        this.tinggi = tinggi;
    }
    
    public String toString(){
        return("Nama : " + nama + "\nTinggi : " + tinggi + "\nBerat : " + berat);
    }
}
