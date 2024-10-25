import java.util.Scanner;
// Don't delete any comments below!!!
// Todo: Import Scanner

public class Main {
    static String [] namaMakanan;
    static int [] jumlahMakanan;
    static String [] hargaMakanan;
    static String [] brandMakanan;
    static int pilihan;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
    
        while (pilihan !=4) {
            System.out.println("==== Menu Inventari Makanan ====");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah ");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
    
    
            pilihan = scanner.nextInt()
            scanner.nextLine();
                    switch(pilihan); {
                    case 1 :
                        inventarisMakanan();
            break
        }
    }

    //Todo : Create ManajemenInventaris Object and Scanner
    public static void inventarisMakanan()
    System.out.println("Masukkan nama Makanan: ");
    String namaMakanan = scanner.nextLine();

    System.out.println("Masukkan Jumlah Makanan: ");
    int jumlahMakanan = scanner.nextInt();

    System.out.println("Masukkan Harga Makanan: ");
    int hargaMakanan = scanner.nextInt();

    System.out.println("Masukkan Brand Makanan: ");
    String brandMakanan = scanner.nextLine();
    //Todo : Create Loop list menu


    }
}