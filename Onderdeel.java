import java.util.ArrayList;


// enum om te kijken of een onderdeel essentieel of extra is
enum Categorie {
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




    public Onderdeel(String ProductNaam, String  ProductOmschrijving, Categorie categorie, int ProductAantal, double StukPrijs, String SoortOnderdeel, int MilieuKorting){

        this.ProductNaam = ProductNaam;
        this.ProductOmschrijving = ProductOmschrijving;
        this.ProductAantal = ProductAantal;
        this.StukPrijs = StukPrijs;
        this.SoortOnderdeel = SoortOnderdeel;
        this.MilieuKorting = MilieuKorting;
        this.categorie = categorie;


    }
    public String toString() {
        return "ProductNaam: " + ProductNaam +
                "\nProductOmschrijving: " + ProductOmschrijving +
                "\nProductAantal: " + ProductAantal +
                "\nStukPrijs: " + StukPrijs +
                "\nSoortOnderdeel: " + SoortOnderdeel +
                "\nMilieuKorting: " + MilieuKorting +
                "\nCategorie: " + categorie;
    }

    public String getNaam() {
        return ProductNaam;
    }

    public void setNaam(String naam) {
        this.ProductNaam = ProductNaam;
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


/*class afwerking extends Onderdeel {

    @Override
    public void setMilieuKorting(double milieuKorting){
        super.MilieuKorting = milieuKorting;
    }
Constructor voor afwerking onderdeel//
    public afwerking(double MilieuKorting) {
        super.MilieuKorting = MilieuKorting;
    }}*/






