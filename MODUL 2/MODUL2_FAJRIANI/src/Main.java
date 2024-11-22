public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer km = new Komputer(0, "Warnet Gaming", 0);
        km.informasi();
        // To do: Panggillah Method Informasi dari class Komputer
        km.informasi();
        

        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP vip = new KomputerVIP(20, "Warnet Gaming X", 10000, true);

        // To do: Panggillah Method Informasi dari class KomputerVIP
        vip.informasi();
        // To do: Panggillah Method Login
        vip.login(null);
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        vip.bermain(6);
        vip.bermain(6, 7);
        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium premium = new KomputerPremium(0, null, 0, true);

        // To do: Panggillah Method IKnformasi dari class KomputerPremium
        premium.informasi();
        // To do: Panggillah Method Pesan
        premium.pesan(0);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        premium.TambahLayanan(null);
        premium.tambahLayanan(null, null);
    }
}