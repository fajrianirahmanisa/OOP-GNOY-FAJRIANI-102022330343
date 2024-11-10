public class Hewan {
    protected String nama;
    protected int umur;

    // Contructor for animal class
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    //Method suara
    public void suara() {
        System.out.println(nama + " mengeong. ");
    }

    //Method makan
    public void makan(){
        System.out.println(nama + " sedang makan.");    
    }

    //Method makan(String makanan)
    public void makan(String makanan){
        System.out.println(nama + " sedang makan " + makanan + " ");
    }
    //Method infoHewan()
    public void infoHewan(){
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun. ");
    }
}
