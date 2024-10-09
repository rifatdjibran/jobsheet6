import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int bil1, bil2, bil3, sementara, terbesar;
        
        // input
        System.out.println("Masukkan bilangan pertama: ");
        bil1 = input.nextInt();
        System.out.println("Masukkan bilangan kedua: ");
        bil2 = input.nextInt();
        System.out.println("Masukkan bilangan ketiga: ");
        bil3 = input.nextInt();

        sementara = Math.max(bil1, bil2);
        terbesar = Math.max(sementara, bil3);

        // output
        System.out.println("Bilangan terbesar adalah: " + terbesar);
    }
}
