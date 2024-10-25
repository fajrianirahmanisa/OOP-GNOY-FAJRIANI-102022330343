// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String namaMakananKering;
    private int jumlahMakananKering; 
    private int hargaMakananKering;
    private String brandMakananKering;
    // Todo : Create Constructor of MakananKering
    public MakananKering (String namaMakananKering, int jumlahMakananKering, int hargaMakananKering, String brandMakananKering ){
        this.namaMakananKering = namaMakananKering;
        this.jumlahMakananKering = jumlahMakananKering;
        this.hargaMakananKering = hargaMakananKering;
        this.brandMakananKering = brandMakananKering;

    }
    // Todo : Create Getter and Setter

    public String ambilNama(){
        return namaMakananKering;
    }

    public int ambilJumlah(){
        return jumlahMakananKering;
    }

    public int ambilharga(){
        return hargaMakananKering;
    }

    public String ambilbrand(){
        return brandMakananKering;
    }
    // Todo : Create Method ShowData

}