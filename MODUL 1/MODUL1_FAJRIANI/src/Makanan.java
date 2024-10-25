// Don't delete any comments below!!!

public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String nama;
    private int jumlahMakanan; 
    private int hargaMakanan;

    // Todo : Create Constructor of Makanan
    public Makanan (String nama, int jumlahMakanan, int hargaMakanan){
        this.nama = nama;
        this.jumlahMakanan = jumlahMakanan;
        this.hargaMakanan = hargaMakanan;
    }
    // Todo : Create Getter and Setter
    public String ambilNama(){
        return nama;
    }

    public int ambilJumlah(){
        return jumlahMakanan;
    }

    public int ambilharga(){
        return hargaMakanan;
    }

 
}
