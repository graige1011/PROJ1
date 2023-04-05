
public class Klanttype {
    private String naam;
    private double korting;

    public Klanttype(String naam, double korting) {
        this.naam = naam;
        this.korting = korting;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getKorting() {
        return korting;
    }

    public void setKorting(double korting) {
        this.korting = korting;
    }

    public Klanttype Overheid = new Klanttype("Overheid", 0.80);
    public Klanttype Bedrijf = new Klanttype("Bedrijf", 0.90);
    public Klanttype Particulier = new Klanttype("Particulier", 1.00);
}
