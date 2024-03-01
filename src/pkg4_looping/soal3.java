
package pkg4_looping;

import java.util.Scanner;

public class soal3 {
    public static void main (String[]  args){
        Scanner scanner = new Scanner (System.in);
        
        //deklarasi
        int a, b, pbt = 0;
        
        //input bilangan a dan b
        System.out.println("bilangan a :");
        a = scanner.nextInt();
        System.out.println("bilangan b :");
        b = scanner.nextInt();
        
        //proses pbt
        while (b != 0){
            pbt = b;
            b = a %b;
            a = pbt;
        }
        System.out.println("hasil dari pembagi bersama terbesar yaitu: "+pbt);
    }
    
}
