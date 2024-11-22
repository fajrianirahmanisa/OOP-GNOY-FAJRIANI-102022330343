public class Burung extends Hewan {
    private String warnaBulu;

    //Constructor
    public Burung(String nama, int umur, String warnaBulu){
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void suara(){
        System.out.println("Suara " + nama + " PRIKITIW ");
    }

    @Override
    public void infoHewan(){
        super.infoHewan();
        System.out.println("Warna Bulu: "+ warnaBulu);
    }
}