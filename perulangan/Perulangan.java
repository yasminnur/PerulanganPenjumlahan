package perulangan;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int proses = 0, a;
        System.out.print("Masukkan jumlah angka : ");
        int b = input.nextInt();
       for( a = 1; a<=b; a++){
           System.out.print(a+" ");
           proses = proses+a;
       }
        System.out.println("= "+proses);
        
    }
    
}
