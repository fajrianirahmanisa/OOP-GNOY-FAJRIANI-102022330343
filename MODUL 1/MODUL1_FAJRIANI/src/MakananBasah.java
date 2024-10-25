// Don't delete any comments below!!!

public class MakananBasah {

    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String namaMakananBasah;
    private int jumlahMakananBasah; 
    private int hargaMakananBasah;
    private String bahanMakananBasah;


    // Todo : Create Constructor of MakananBasah

    public MakananBasah (String namaMakananBasah, int jumlahMakananBasah, int hargaMakananBasah, String bahanMakananBasah ){
        this.namaMakananBasah = namaMakananBasah;
        this.jumlahMakananBasah = jumlahMakananBasah;
        this.hargaMakananBasah = hargaMakananBasah;
        this.bahanMakananBasah = bahanMakananBasah;
    }
    
    // Todo : Create Getter and Setter

    public String ambilNama(){
        return namaMakananBasah;
    }

    public int ambilJumlah(){
        return jumlahMakananBasah;
    }

    public int ambilharga(){
        return hargaMakananBasah;
    }

    public String ambilBahan(){
        return bahanMakananBasah;
    }
    // Todo : Create Method ShowData


}
