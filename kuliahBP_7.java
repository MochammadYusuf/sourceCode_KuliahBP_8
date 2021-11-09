package kuliah;

import java.util.Scanner;

public class kuliahBP_7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Program Menampilkan Bil. Prima");
        
        System.out.print("Tentukan Banyak Bil. Prima : ");
        int n = scan.nextInt();
        
        int count = 1, bil;
        
        for(int a = 2; count <= n; a++) {
            bil = 1;
            for(int b = 2; b < a; b++) {
                if(a % b == 0) {
                    bil++;
                }
            }
            if(bil == 1) {
                System.out.print(a + " ");
                count = count + 1;
            }    
        }
    }
}