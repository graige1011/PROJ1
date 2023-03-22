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
 }
public class KeanuTesting {



    public static void main(String[] args) {

        Onderdeel2 roer = new Onderdeel2("Roer","Carbon fibre ",1,799.99,799.99);
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving", "Aantal", "Stukprijs", " Totaal");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", roer.naam, roer.omschrijving, roer.aantal, roer.stukprijs, roer.totaal);

    }
}
