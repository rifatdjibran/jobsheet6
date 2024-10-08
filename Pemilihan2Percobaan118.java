import java.util.Scanner;

public class Pemilihan2Percobaan118 { // Ganti nama class sesuai nomor absen 18
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int tahun;

        // input
        System.out.print("Masukkan tahun: ");
        tahun = input.nextInt(); 


        if (tahun % 4 == 0) {  // Cek jika kelipatan 4
            if (tahun % 100 == 0) {  // Jika kelipatan 100, bukan kabisat
                System.out.println(tahun + " bukan tahun kabisat.");
            } else {  // Jika tidak kelipatan 100, kabisat
                System.out.println(tahun + " adalah tahun kabisat.");
            }
        } else {  // Tidak kelipatan 4, bukan kabisat
            System.out.println(tahun + " bukan tahun kabisat.");
        }
    }
}
