public class Main{
    public static void main(String[] args) {
        Offerte offerte1 =  new Offerte(157,"22-03-23","waterworks","andijlaan 21",616505007,859.99);
        Onderdeel roer = new Onderdeel("Roer", "description 1",Categorie.ESSENTIEEL, 1, 50.00,1.00);
        Onderdeel mast = new Onderdeel("mast", "description 2", Categorie.ESSENTIEEL,1, 30.00,1.00);
        Onderdeel engine = new Onderdeel("engine", "description 4",Categorie.ESSENTIEEL ,1, 20.00,1.00);
        Onderdeel carborator = new Onderdeel("carborator", "description 4",Categorie.ESSENTIEEL ,1, 40.00,1.00);
        offerte1.OnderdeelList.add(roer);
        offerte1.OnderdeelList.add(mast);
        offerte1.OnderdeelList.add(engine);
        offerte1.OnderdeelList.add(carborator);

        offerte1.offerteInfo();




        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving","Categorie", "Aantal", "Stukprijs", " Totaal");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
        for (Onderdeel p : offerte1.OnderdeelList){
            System.out.printf("%-15s %-20s %-10s %-15s %-15s\n",p.ProductNaam,p.ProductOmschrijving,p.categorie,p.ProductAantal,p.StukPrijs,p.MilieuKorting );
        }

    }
}