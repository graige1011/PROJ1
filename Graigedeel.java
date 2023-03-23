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
        Onderdeel mast = new Onderdeel("part2", "description 2", 1, 30.00,1.00);
        offerte1.OnderdeelList.add(roer);
        offerte1.OnderdeelList.add(mast);


        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving", "Aantal", "Stukprijs", " Totaal");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
        for (Onderdeel p : offerte1.OnderdeelList){
            System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", OnderdeelList.roer.naam, OnderdeelList.roer.omschrijving, OnderdeelList.roer.aantal, OnderdeelList.roer.stukprijs, OnderdeelList.roer.stuktotaal)
        }


    }
}
