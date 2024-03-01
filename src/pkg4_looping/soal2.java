
package pkg4_looping;

//librari untuk menginpor scanner untuk melakukan sebuah inputan
import java.util.Scanner;

public class soal2 {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        //deklarasi
        int batasAwal, batasAkhir, i, jumlah = 0;
        
        System.out.println("inputan bilangan awal :");
        batasAwal = scanner.nextInt();
        
        System.out.println("inputan bilangan akhir :");
        batasAkhir = scanner.nextInt();
        
        //proses looping emnggunakan for 
        for(i = batasAwal; i<= batasAkhir; i++){
            //situasi penggunaan if dengan i mod 2
            if(i % 2 == 0 ){
                jumlah++;
            }
        }
        //output dari proses loopiong
        System.out.println("jumlah bilagnan genap :"+jumlah);
    }
    
}
