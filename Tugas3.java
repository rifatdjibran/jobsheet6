import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variabel
        String brand, kategori;
        int ukuran;
        double harga = 0;
        boolean dataValid = true;

        // input
        System.out.println("Masukkan brand (converse, skecher, nike): ");
        brand = scanner.nextLine().toLowerCase();

        System.out.println("Masukkan kategori (Slip on, High Top, Woman, Man, Kids, Adult): ");
        kategori = scanner.nextLine().toLowerCase();

        System.out.println("Masukkan ukuran (contoh: 36, 37, 38...): ");
        ukuran = scanner.nextInt();

        if (brand.equals("converse")) {
            if (kategori.equals("slip on")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800000;
                } else {
                    dataValid = false;
                }
            } else if (kategori.equals("high top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                } else {
                    dataValid = false;
                }
            } else {
                dataValid = false;
            }
        } else if (brand.equals("skecher")) {
            if (kategori.equals("woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                } else {
                    dataValid = false;
                }
            } else if (kategori.equals("man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                } else {
                    dataValid = false;
                }
            } else {
                dataValid = false;
            }
        } else if (brand.equals("nike")) {
            if (kategori.equals("kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                } else {
                    dataValid = false;
                }
            } else if (kategori.equals("adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                } else {
                    dataValid = false;
                }
            } else {
                dataValid = false;
            }
        } else {
            dataValid = false;
        }

        // output
        if (dataValid) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Data Tidak Valid");
        }

        scanner.close();
    }
}