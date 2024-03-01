package pkg4_looping;

//librari untuk menginpor scanner untuk melakukan sebuah inputan
import java.util.Scanner;

public class soal1 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //deklarasi
        int angka, i;
        
        //input angka
        System.out.println("masukan angka");
        angka = scanner.nextInt();
        
        //proses looping
        for(i = 0; i< angka; i++){
            System.out.println("saya senang bahasa java");
        }
        
    }
    
}
