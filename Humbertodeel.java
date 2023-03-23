import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class UserStory1 {

    // Definieer de categorieën
    enum Categorie {
        ESSENTIEEL,
        EXTRA
    }


    // Definieer de opties
    class Optie {
        String naam;
        String omschrijving;
        Categorie categorie;

        public Optie(String naam, String omschrijving, Categorie categorie) {
            this.naam = naam;
            this.omschrijving = omschrijving;
            this.categorie = categorie;
        }
    }

    // Lijst met alle beschikbare opties
    ArrayList<Optie> opties;

    public UserStory1() {
        opties = new ArrayList<Optie>();

        // Voeg opties toe aan de lijst
        opties.add(new Optie("Motor", "Krachtbron van het schip", Categorie.ESSENTIEEL));
        opties.add(new Optie("Roer", "Besturing van het schip", Categorie.ESSENTIEEL));
        opties.add(new Optie("Anker", "Voor anker gaan bij stilstand", Categorie.EXTRA));
        opties.add(new Optie("Radio", "Communicatie op het schip", Categorie.EXTRA));

        // Sorteer de lijst op categorie en dan op naam
        Collections.sort(opties, new Comparator<Optie>() {
            public int compare(Optie o1, Optie o2) {
                if (o1.categorie != o2.categorie) {
                    return o1.categorie.compareTo(o2.categorie);
                } else {
                    return o1.naam.compareTo(o2.naam);
                }
            }
        });
    }

    // Methode om de lijst van opties te tonen
    public void toonOpties() {
        for (Optie optie : opties) {
            System.out.println(optie.categorie + ": " + optie.naam + " - " + optie.omschrijving);
        }
    }

    // Test de code
    public static void main(String[] args) {
        UserStory1 opties = new UserStory1();
        opties.toonOpties();
    }
}


class Offerte4 {

    private KlantType klantType;
    private List<Optie> gekozenOpties;

    public Offerte4(KlantType klantType, List<Optie> gekozenOpties) {
        this.klantType = klantType;
        this.gekozenOpties = gekozenOpties;
    }

    public double berekenTotaalPrijs() {
        double totaal = 0.0;
        for (Optie optie : gekozenOpties) {
            totaal += optie.getPrijs(klantType);
        }
        return totaal;
    }

    public String getTotaalPrijsAlsString() {
        double totaalPrijs = berekenTotaalPrijs();
        return String.format("Totaalprijs: €%.2f", totaalPrijs);
    }

    // getters en setters voor klantType en gekozenOpties


    class Optie {

        private String naam;
        private double essentielePrijs;
        private double extraPrijs;

        public Optie(String naam, double essentielePrijs, double extraPrijs) {
            this.naam = naam;
            this.essentielePrijs = essentielePrijs;
            this.extraPrijs = extraPrijs;
        }

        public double getPrijs(KlantType klantType) {
            if (klantType == KlantType.STANDAARD) {
                return essentielePrijs;
            } else if (klantType == KlantType.PREMIUM) {
                return extraPrijs;
            } else {
                throw new IllegalArgumentException("Ongeldig klanttype: " + klantType);
            }
        }

        // getters en setters voor naam, essentielePrijs en extraPrijs
    }

    enum KlantType {
        STANDAARD,
        PREMIUM
    }
}
