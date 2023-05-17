import java.util.ArrayList;

enum Categorie { // enumeration gebruikt om te kijken of een onderdeel essentieel of extra is
    ESSENTIEEL,
    EXTRA
}
class Onderdeel { // onderdeel class

    private String ProductNaam;
    private String ProductOmschrijving;
    private int ProductAantal;
    protected double StukPrijs;
    private String SoortOnderdeel;

    protected int MilieuKorting;

    Categorie categorie;

    ArrayList<Onderdeel> OnderdeelList = new ArrayList<Onderdeel>();

    public Onderdeel(String ProductNaam, String  ProductOmschrijving, Categorie categorie, int ProductAantal, double StukPrijs, String SoortOnderdeel, int MilieuKorting){ //constructor voor onderdeel class

        this.ProductNaam = ProductNaam;
        this.ProductOmschrijving = ProductOmschrijving;
        this.categorie = categorie;
        this.ProductAantal = ProductAantal;
        this.StukPrijs = StukPrijs;
        this.SoortOnderdeel = SoortOnderdeel;
        this.MilieuKorting = MilieuKorting;



    }
    public String toString() { // toString dat in het beginfase werd gebruikt om dingen te testen in onderdeel class
        return "ProductNaam: " + ProductNaam +
                "\nProductOmschrijving: " + ProductOmschrijving +
                "\nProductAantal: " + ProductAantal +
                "\nStukPrijs: " + StukPrijs +
                "\nSoortOnderdeel: " + SoortOnderdeel +
                "\nMilieuKorting: " + MilieuKorting +
                "\nCategorie: " + categorie;
    }

    public String getNaam() { //getters and setters
        return ProductNaam;
    }

    public void setNaam(String naam) {
        this.ProductNaam = naam;
    }

    public String getOmschrijving() {
        return ProductOmschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.ProductOmschrijving = ProductOmschrijving;
    }
    public void setAantal(int aantal) {
        this.ProductAantal = aantal;
    }
    public int getAantal() {
        return ProductAantal;
    }


    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    public String getSoortOnderdeel() {
        return SoortOnderdeel;
    }

    public void setSoortOnderdeel(String soortOnderdeel) {
        SoortOnderdeel = soortOnderdeel;
    }
    public double getPrijs() {
        return  StukPrijs;
    }

    public void setStukPrijs(double stukPrijs) {StukPrijs = stukPrijs;}
    public void setMilieuKorting(int milieuKorting){this.MilieuKorting = milieuKorting;}
    public int getMilieuKorting(){
        return MilieuKorting;
    }


}









