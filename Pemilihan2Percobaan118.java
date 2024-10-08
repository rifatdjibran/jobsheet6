import java.util.Scanner;

public class Pemilihan2Percobaan118 { 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int tahun;

        // input
        System.out.print("Masukkan tahun: ");
        tahun = input.nextInt(); 


        if ((tahun % 4) == 0) {  
            if ((tahun % 100) == 0) {  
                if ((tahun % 400) == 0) {
                    System.out.println(tahun + " adalah tahun kabisat.");
                } else {
                    System.out.println(tahun + " bukan tahun kabisat.");
                }
            } else {  
                System.out.println(tahun + " adalah tahun kabisat.");
            }
        } else {  
            System.out.println(tahun + " bukan tahun kabisat.");
        }    
    }
}
