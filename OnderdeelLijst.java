import java.util.List;

public class OnderdeelLijst {
    public static List<Onderdeel> createOnderdelen() {
        return List.of(
                new Onderdeel("Roer", "description 1", Categorie.ESSENTIEEL, 1, 50.00, 1.00),
                new Onderdeel("mast", "description 2", Categorie.ESSENTIEEL, 1, 30.00, 1.00),
                new Onderdeel("engine", "description 4", Categorie.ESSENTIEEL, 1, 20.00, 1.00),
                new Onderdeel("carborator", "description 4", Categorie.ESSENTIEEL, 1, 40.00, 1.00)
        );
    }
}
