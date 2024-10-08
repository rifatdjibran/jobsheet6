import java.util.Scanner;

public class Pemilihan2Percobaan2_18 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int pilihan_menu = 0;
        String member = "";
        double diskon = 0.0;
        int harga = 0;
        double total_bayar;

        // tampilan awal
        System.out.println("=====================================");
        System.out.println("========== MENU KAFE JTI ===========");
        System.out.println("=====================================");
        System.out.println("1. Ricebowl Rp 14.000");
        System.out.println("2. Ice Tea Rp 3.000");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea) Rp 15.000");
        System.out.println("=====================================");

        // input
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input.nextInt();
        input.nextLine();  
        
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.nextLine();

        // struktur jika pembeli member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10; 
            System.out.println("Besar diskon = 10%");

            // menu
            if (pilihan_menu == 1) {
                harga = 14000; 
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000; 
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000; 
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; 
            }

            // total bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

            // struktur jika pembeli pembeli bukan member
        } else if (member.equalsIgnoreCase("n")) { 
            
            // menu
            if (pilihan_menu == 1) {
                harga = 14000; 
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000; 
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000; 
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; 
            }

            // total tanpa diskon karena bukan member
            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("Member tidak valid");
            System.out.println("----------------------------------------");
        }
    }
}
