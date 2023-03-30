import java.util.ArrayList;
public class OnderdeelLijst {
    private ArrayList<Onderdeel> onderdelen;

    public OnderdeelLijst() {
        onderdelen = new ArrayList<Onderdeel>();
        onderdelen.add(new Onderdeel("Roer", "description 1",Categorie.ESSENTIEEL, 1, 50.00,1.00));
        onderdelen.add(new Onderdeel("mast", "description 2", Categorie.ESSENTIEEL,1, 30.00,1.00));
        onderdelen.add(new Onderdeel("engine", "description 4",Categorie.ESSENTIEEL ,1, 20.00,1.00));
        onderdelen.add(new Onderdeel("carborator", "description 4",Categorie.ESSENTIEEL ,1, 40.00,1.00));
    }

    public ArrayList<Onderdeel> getOnderdelen() {
        return onderdelen;
    }

    // Other methods for managing onderdelen go here
}

