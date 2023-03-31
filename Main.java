import java.util.List;

public class Main{
    public static void main(String[] args) {
        Offerte offerte1 =  new Offerte(157,"22-03-23","waterworks","andijlaan 21",616505007,859.99);

        List<Onderdeel> onderdelen = OnderdeelFactory.createOnderdelen();

//        offerte1.Onderdelen.add(roer);
//        offerte1.Onderdelen.add(mast);
//        offerte1.Onderdelen.add(engine);
//        offerte1.Onderdelen.add(carborator);

        offerte1.offerteInfo();
        offerte1.Onderdelen.addAll(onderdelen);



        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving","Categorie", "Aantal", "Stukprijs", " Totaal");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
        for (Onderdeel p : offerte1.Onderdelen){
            System.out.printf("%-15s %-20s %-10s %-15s %-15s\n",p.ProductNaam,p.ProductOmschrijving,p.categorie,p.ProductAantal,p.StukPrijs,p.MilieuKorting );
        }

    }
}