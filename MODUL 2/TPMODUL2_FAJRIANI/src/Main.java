public class Main {
    public static void main(String[] args) {
        System.out.println("Ini Hewan Saya");

        //objek kucing
        Kucing kc = new Kucing ("Oneng ", 5, "Kampung");
        System.out.println(kc.nama + "adalah kucingku");
        kc.suara();
        kc.makan();
        kc.makan("pindang");
        kc.infoHewan();

        System.out.println();

        //objek burung

        Burung br = new Burung("Tejo", 5, "Pelangi");
        System.out.println(br.nama + " adalah burungku"  );
        br.suara();
        br.makan();
        br.makan("odading");
        br.infoHewan();
    }

}
