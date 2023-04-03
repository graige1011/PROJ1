public class Gebruiker {
        private String gebruikersnaam;
        private String wachtwoord;
        private String rol;

        public Gebruiker(String gebruikersnaam, String wachtwoord, String rol) {
            this.gebruikersnaam = gebruikersnaam;
            this.wachtwoord = wachtwoord;
            this.rol = rol;
        }

        public String getGebruikersnaam() {
            return gebruikersnaam;
        }

        public String getWachtwoord() {
            return wachtwoord;
        }

        public String getRol() {
            return rol;
        }
    }

