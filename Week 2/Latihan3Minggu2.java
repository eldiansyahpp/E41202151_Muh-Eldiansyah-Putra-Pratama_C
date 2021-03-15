/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3minggu2;
class book {
    int price;
    int pages;
    
    public void set (int price, int pages){
        this.price = price;
        this.pages = pages;
    }
    
    public void show (){
        System.out.println("Book Information");
        System.out.println("Book price : "+price);
        System.out.println("Number of pages : "+pages);
    }
}
/**
 *
 * @author Eldi
 */
public class Latihan3Minggu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        book javabook = new book();
        javabook.set(60000, 100);
        javabook.show();
    }
    
}
