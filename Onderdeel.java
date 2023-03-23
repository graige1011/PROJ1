//Abstracte class om onderdelen vanuit te creeren//
import java.util.ArrayList;

enum Categorie {
    ESSENTIEEL,
    EXTRA
}
public abstract class Onderdeel {

    String ProductNaam;
    String ProductOmschrijving;
    int ProductAantal;
    protected double StukPrijs;

    protected double MilieuKorting;

    Categorie categorie;

    ArrayList<Onderdeel> OnderdeelList = new ArrayList<Onderdeel>();


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
        this.ProductAantal = ProductAantal;
    }


    public double getPrijs() {
        return  (StukPrijs * MilieuKorting);
    }
//Abstracte method voor het toevoegen van een milieukorting op een onderdeel//
    abstract void setMilieuKorting(double milieuKorting);
}

class afwerking extends Onderdeel {

    @Override
    public void setMilieuKorting(double milieuKorting){
        super.MilieuKorting = milieuKorting;
    }
    //Constructor voor afwerking onderdeel//
    public afwerking(double MilieuKorting) {
        super.MilieuKorting = MilieuKorting;
    }

}



    Onderdeel roer = new Onderdeel("Roer", "description 1", 1, 50.00,1.00);
    Onderdeel mast = new Onderdeel("part2", "description 2", 1, 30.00,1.00);

        OnderdeelList.add(roer);
        OnderdeelList.add(mast);

