import java.util.ArrayList;

class Offerte{
    int offertenr;
    ArrayList<Onderdeel> OnderdeelList;
    String datum;
    String bedrijfsnaam;
    String adres;
    int telefoonnr;
    double totaal;

    public Offerte(int offertenr, String datum, String bedrijfsnaam, String adres, int telefoonnr,double totaal) {
        this.offertenr = offertenr;
        this.datum = datum;
        this.bedrijfsnaam = bedrijfsnaam;
        this.adres = adres;
        this.telefoonnr = telefoonnr;
        this.totaal = totaal;
        this.OnderdeelList = new ArrayList<Onderdeel>();
    }

    public int getOffertenr() {
        return offertenr;
    }

    public void setOffertenr(int offertenr) {
        this.offertenr = offertenr;
    }

//    public Onderdeel getOnderdeel() {
//        return onderdeel;
//    }

//    public void setOnderdeel(Onderdeel onderdeel) {
//        this.onderdeel = onderdeel;
//    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getBedrijfsnaam() {
        return bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        this.bedrijfsnaam = bedrijfsnaam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefoonnr() {
        return telefoonnr;
    }

    public void setTelefoonnr(int telefoonnr) {
        this.telefoonnr = telefoonnr;
    }
}

public class Graigedeel {
    public static void main(String[] args) {
        Offerte offerte1 =  new Offerte(157,"22-03-23","waterworks","andijlaan 21",616505007,859.99);
        System.out.println("Offerte Nr: "+ offerte1.offertenr);
        System.out.println("");
        System.out.println("Datum: "+ offerte1.datum);
        System.out.println("");
        System.out.println("Bedrijfsnaam: "+ offerte1.bedrijfsnaam);
        System.out.println("");
        System.out.println("Adres: "+ offerte1.adres);
        System.out.println("");
        System.out.println("");
        Onderdeel roer = new Onderdeel("Roer", "description 1", 1, 50.00,1.00);
        Onderdeel mast = new Onderdeel("mast", "description 2", 1, 30.00,1.00);
        Onderdeel engine = new Onderdeel("engine", "description 4", 1, 20.00,1.00);
        Onderdeel miter = new Onderdeel("carborator", "description 4", 1, 40.00,1.00);
        Onderdeel draaibank = new Onderdeel("carborator", "description 4", 1, 40.00,1.00);
        Onderdeel carborator = new Onderdeel("carborator", "description 4", 1, 40.00,1.00);
        offerte1.OnderdeelList.add(roer);
        offerte1.OnderdeelList.add(mast);
        offerte1.OnderdeelList.add(engine);
        offerte1.OnderdeelList.add(carborator);
        offerte1.OnderdeelList.add(draaibank);
        offerte1.OnderdeelList.add(miter);


        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving", "Aantal", "Stukprijs", " Totaal");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
        for (Onderdeel p : offerte1.OnderdeelList){
            System.out.printf("%-15s %-20s %-10s %-15s %-15s\n",p.ProductNaam,p.ProductOmschrijving,p.ProductAantal,p.StukPrijs,p.MilieuKorting );
        }

    }
}
