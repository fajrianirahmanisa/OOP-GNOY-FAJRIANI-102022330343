class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer , String namaWarnet , float hargaPerJam, Boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void informasi(){
        super.informasi();
        if (ruangPrivat){
            System.out.println("Status :Ruangan Premium");
            System.out.println("\nFasilitas Ruang Premium");
            System.out.println("- Ruangan ber-ACA pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("-Komputer spesifikasi tinggi");
            System.out.println("- Koneksi interbet dedicated 100Mbps");
        }
        else{
            System.out.println("Status : Ruangan Standar");
            System.out.println("\nFasilitas Ruang Standar");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
    }
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
        System.out.println("Memesan Komputer nomor : "+nomorKomputer);
}
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan: "+makanan);
    }
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void tambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan: " + makanan + "dan" + minuman);
    }

}
