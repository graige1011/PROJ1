import java.util.List;

public class OnderdeelLijst extends Onderdeel {


    public OnderdeelLijst(String ProductNaam, String ProductOmschrijving, Categorie categorie, int ProductAantal, double StukPrijs, String SoortOnderdeel, double MilieuKortingl) {
        super(ProductNaam, ProductOmschrijving, categorie, ProductAantal, StukPrijs, SoortOnderdeel, MilieuKortingl);
    }

    public static List<Onderdeel> createOnderdelen() {
        return List.of(
                new Onderdeel("HoutenRomp","description 1",Categorie.ESSENTIEEL,1,50.00,"ROMP",1.00),
                new Onderdeel("AluminiumRomp","description 2",Categorie.ESSENTIEEL,1,50.00,"ROMP",1.00),
                new Onderdeel("FibreglasRomp","description 3",Categorie.ESSENTIEEL,1,50.00,"ROMP",1.00),
                new Onderdeel("StalenRomp","description 4",Categorie.ESSENTIEEL,1,50.00,"ROMP",1.00),
                new Onderdeel("900PK Motor","description 1",Categorie.ESSENTIEEL,1,50.00,"ENGINE",1.00),
                new Onderdeel("300PK Motor","description 1",Categorie.ESSENTIEEL,1,50.00,"ENGINE",1.00)
        );
    }
}
