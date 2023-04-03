import java.util.ArrayList;


// enum om te kijken of een onderdeel essentieel of extra is
enum Categorie {
    ESSENTIEEL,
    EXTRA
}
class Onderdeel { // onderdeel class

    String ProductNaam;
    String ProductOmschrijving;
    int ProductAantal;
    protected double StukPrijs;

    protected double MilieuKorting;

    Categorie categorie;

    ArrayList<Onderdeel> OnderdeelList = new ArrayList<Onderdeel>();


    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Onderdeel(String ProductNaam, String  ProductOmschrijving, Categorie categorie, int ProductAantal, double StukPrijs, double MilieuKorting){

        this.ProductNaam = ProductNaam;
        this.ProductOmschrijving = ProductOmschrijving;
        this.ProductAantal = ProductAantal;
        this.StukPrijs = StukPrijs;
        this.MilieuKorting = MilieuKorting;
        this.categorie = categorie;
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

    public int getAantal() {
        return ProductAantal;
    }

    public void setAantal(int aantal) {
        this.ProductAantal = aantal;
    }


    public double getPrijs() {
        return  (StukPrijs * MilieuKorting);
    }
//Abstracte method voor het toevoegen van een milieukorting op een onderdeel//
    public void setMilieuKorting(double milieuKorting){
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






