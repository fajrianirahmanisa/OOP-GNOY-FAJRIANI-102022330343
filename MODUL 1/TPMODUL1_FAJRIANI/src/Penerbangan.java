import java.util.Scanner;

public class Penerbangan {
    static String[] nomorpenerbangan = {"GA101", "QZ202"};
    static String[] bandarakeberangkatan = {"CGK, Jakarta", "SUB, Surabaya"};
    static String[] waktukeberangkatan = {"06:30", "09:00"};
    static String[] bandaratujuan = {"DPS, Bali", "KNO, Medan"};
    static String[] waktukedatangan = {"08:15", "11:45"};
    static int[] hargatiket = {1200000, 1350000};
    static boolean pesananya = false; 
    static String nik; 
    static String namadepan; 
    static String namabelakang; 
    static int pilihanpenerbangan; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("===== EAD Ticket Booking System =====");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    beliTiket(scanner);
                    break;
                case 3:
                    tampilkanPesananTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak ada. Silahkan pilih menu yang ada.");
            }

            System.out.println();
        }

        scanner.close();
    }

    static void tampilkanDaftarPenerbangan() {
        // daftar penerbangan
        for (int i = 0; i < nomorpenerbangan.length; i++) {
            System.out.println(i + 1 + ".");
            System.out.println("Nomor Penerbangan: " + nomorpenerbangan[i]);
            System.out.println("Bandara Keberangkatan: " + bandarakeberangkatan[i]);
            System.out.println("Waktu Keberangkatan: " + waktukeberangkatan[i] + " ---> Waktu Kedatangan: " + waktukedatangan[i]);
            System.out.println("Harga Tiket: Rp." + hargatiket[i] + ".0");
            System.out.println();
        }
        pesananya = true;
    }

    static void beliTiket(Scanner scanner) {
        System.out.println("Silakan isi data diri anda terlebih dahulu!");

        System.out.print("Masukkan NIK: ");
        nik = scanner.nextLine();

        System.out.print("Masukkan Nama Depan: ");
        namadepan = scanner.nextLine();

        System.out.print("Masukkan Nama Belakang: ");
        namabelakang = scanner.nextLine();

        System.out.println("\nTerima Kasih telah Mengisi Data Pelanggan. Silakan Pilih Tiket Penerbangan Yang Tersedia");

        // daftar penerbangan yang tersedia
        tampilkanDaftarPenerbangan();

        System.out.print("Pilih nomor penerbangan (ex: 1): ");
        pilihanpenerbangan = scanner.nextInt() - 1;
        scanner.nextLine(); 

        // Validasi 
        if (pilihanpenerbangan < 0 || pilihanpenerbangan >= nomorpenerbangan.length) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        // Konfirmasi
        System.out.println("\nPemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
        pesananya = true; 
    }

    static void tampilkanPesananTiket() {
        if (!pesananya) {
            System.out.println("Belum ada pesanan tiket.");
            return;
        }

        System.out.println("===== Pesanan Tiket =====");
        //data penerbangan yang sudah dipesan
        System.out.println("Nama Pemesan: " + namadepan + " " + namabelakang);
        System.out.println("NIK: " + nik);
        System.out.println("Nomor Penerbangan: " + nomorpenerbangan[pilihanpenerbangan]);
        System.out.println("Bandara Keberangkatan: " + bandarakeberangkatan[pilihanpenerbangan]);
        System.out.println("Bandara Tujuan: " + bandaratujuan[pilihanpenerbangan]);
        System.out.println("Waktu Keberangkatan: " + waktukeberangkatan[pilihanpenerbangan]);
        System.out.println("Waktu Kedatangan: " + waktukedatangan[pilihanpenerbangan]);
        System.out.println("Harga Tiket: Rp. " + hargatiket[pilihanpenerbangan]);

    }
}
