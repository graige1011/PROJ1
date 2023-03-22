public abstract class Klant {
    String voorNaam;
    String achterNaam;
    String email;

}

class Particulier extends Klant {
    double particuliersKorting = 0.90;

}

class Overheid extends Klant {
    double overheidsKorting = 1.00;

}
class Bedrijf extends Klant {
    double bedrijfsKorting = 0.80;

}
