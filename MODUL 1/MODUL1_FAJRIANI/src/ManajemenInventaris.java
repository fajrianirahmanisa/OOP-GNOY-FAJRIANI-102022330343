import java.util.ArrayList;
import java.util.Scanner;
// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items

    ArrayList<MakananKering> dafMakananKering = new ArrayList<>();

    ArrayList<MakananBasah> dafMakananBasah = new ArrayList<>();

    Scanner scanner = new Scanner (System.in);

    public void tambahMakananKering() {

        // Todo : Create ManajemenInventaris Object and Scanner
        System.out.println("Masukkan Nama Makanan");
        String daftarMakananKering = scanner.nextLine();

        System.out.println("Masukkan Jumlah Makanan");
        int jdaftarMakananBasah = scanner.nextInt();

        System.out.println("Masukkan Harga Makanan: ");
        int hargaMakanan = scanner.nextInt();

        System.out.println("Masukkan Brand Makanan: ");
        String brandMakanan = scanner.nextLine();

        // Todo : Create Loop list menu
    }
    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.println("Masukkan Nama Makanan");
        String daftarMakananBasah = scanner.nextLine();

        System.out.println("Masukkan Harga Makanan: ");
        int hargaMakananBasah = scanner.nextInt();

        System.out.println("Masukkan Bahan Makanan: ");
        String brandMakananBasah = scanner.nextLine();
        // Todo : Create a new object for MakananBasah
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    }
}
