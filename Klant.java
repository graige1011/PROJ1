public class Klant {
    private String voorNaam;
    private String achterNaam;
    private String email;
    private Klanttype klanttype;

    public Klant(String voorNaam, String achterNaam, String email, Klanttype klanttype) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.email = email;
        this.klanttype = klanttype;
    }

    public Klant(String voorNaam, String achterNaam, String email) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.email = email;
        this.klanttype = null;
    }

    //Getters & Setters//
    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Klanttype getKlanttype() {
        return klanttype;
    }

    public void setKlanttype(Klanttype klanttype) {
        this.klanttype = klanttype;
    }


}

