 class Onderdeel2 {
    String naam;
    String omschrijving;
    int aantal;
    double stukprijs;
    double totaal;

     public Onderdeel2(String naam, String omschrijving, int aantal, double stukprijs, double totaal){
         this.naam = naam;
         this.omschrijving = omschrijving;
         this.aantal = aantal;
         this.stukprijs = stukprijs;
         this.totaal = totaal;
     }

     public String getNaam() {
         return naam;
     }

     public void setNaam(String naam) {
         this.naam = naam;
     }

     public String getOmschrijving() {
         return omschrijving;
     }

     public void setOmschrijving(String omschrijving) {
         this.omschrijving = omschrijving;
     }

     public int getAantal() {
         return aantal;
     }

     public void setAantal(int aantal) {
         this.aantal = aantal;
     }

     public double getStukprijs() {
         return stukprijs;
     }

     public void setStukprijs(double stukprijs) {
         this.stukprijs = stukprijs;
     }

     public double getTotaal() {
         return totaal;
     }

     public void setTotaal(double totaal) {
         this.totaal = totaal;
     }
 }
public class KeanuTesting {



    public static void main(String[] args) {

        Onderdeel2 roer = new Onderdeel2("Roer","Carbon fibre ",1,799.99,799.99);
        Onderdeel2 mast = new Onderdeel2("Mast","30CM Staal",1,1599.99,1599.99);
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving", "Aantal", "Stukprijs", " Totaal");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", roer.naam, roer.omschrijving, roer.aantal, roer.stukprijs, roer.totaal);
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", mast.naam, mast.omschrijving, mast.aantal, mast.stukprijs, mast.totaal);

    }
}
