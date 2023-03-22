//Abstracte class om onderdelen vanuit te creeren//
public abstract class Onderdeel {
    protected double prijs;
    protected double milieuKorting;

    public double getPrijs() {
        return  (prijs * milieuKorting);
    }
//Abstracte method voor het toevoegen van een milieukorting op een onderdeel//
    abstract void setMilieuKorting(double milieuKorting);
}

class afwerking extends Onderdeel {

    @Override
    public void setMilieuKorting(double milieuKorting){
        super.milieuKorting = milieuKorting;
    }
    //Constructor voor afwerking onderdeel//
    public afwerking(double milieuKorting) {
        super.milieuKorting = milieuKorting;
    }

}

