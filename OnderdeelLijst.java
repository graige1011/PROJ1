import java.util.List;

public class OnderdeelLijst extends Onderdeel {
    public OnderdeelLijst(String ProductNaam, String ProductOmschrijving, Categorie categorie, int ProductAantal, double StukPrijs, double MilieuKorting) {
        super(ProductNaam, ProductOmschrijving, categorie, ProductAantal, StukPrijs, MilieuKorting);
    } //voeg hier nieuwe onderdelen toe

    public static List<Onderdeel> createOnderdelen() {
        return List.of(
                new Onderdeel("StalenRomp", "description 1", Categorie.ESSENTIEEL, 1, 50.00, 1.00),
                new Onderdeel("AluminiumRomp", "description 1", Categorie.ESSENTIEEL, 1, 50.00, 1.00),
                new Onderdeel("HoutRomp", "description 1", Categorie.ESSENTIEEL, 1, 50.00, 1.00),
                new Onderdeel("FibreGlasRomp", "description 2", Categorie.ESSENTIEEL, 1, 30.00, 1.00),
                new Onderdeel("engine", "description 4", Categorie.ESSENTIEEL, 1, 20.00, 1.00),
                new Onderdeel("carborator", "description 4", Categorie.ESSENTIEEL, 1, 40.00, 1.00)
        );
    }
}
