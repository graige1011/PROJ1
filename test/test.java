import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    private Klant klant;

    @BeforeEach
    public void setUp() {
        // Set up a new Klant object before each test
        klant = new Klant("John", "Doe", "johndoe@example.com");
    }

    @Test
    public void testVoorNaam() {
        // Test het instellen en ophalen van voorNaam
        klant.setVoornaam("Johnny");
        assertEquals("Johnny", klant.getVoornaam(), "VoorNaam zou 'Johnny' moeten zijn");
    }

    @Test
    public void testAchterNaam() {
        // Test het instellen en ophalen van achterNaam
        klant.setAchternaam("Smith");
        assertEquals("Smith", klant.getAchternaam(), "AchterNaam zou 'Smith' moeten zijn");
    }

    @Test
    public void testEmail() {
        // Test het instellen en ophalen van email
        klant.setEmail("johnsmith@example.com");
        assertEquals("johnsmith@example.com", klant.getEmail(), "Email zou 'johnsmith@example.com' moeten zijn");
    }
    @Test
    public void testVoegKlanttypeToe() {
        // Aanmaken van een nieuw Klanttype object met de naam "Test" en een waarde van 0.5
        Klanttype klanttype = new Klanttype("Test", 0.5);

        // Toevoegen van het Klanttype object aan de lijst van Klanttypes
        Klanttype.voegKlanttypeToe(klanttype);

        // Ophalen van de lijst van Klanttypes
        ArrayList<Klanttype> klanttypes = Klanttype.getKlanttypes();

        // Controleren of het Klanttype object is toegevoegd aan de lijst van Klanttypes
        assertTrue(klanttypes.contains(klanttype));}
    @Test
    public void testGetKlanttypeNaam() {
        Klanttype klanttype = new Klanttype("Student", 0.75);
        String verwachteNaam = "Student";
        String daadwerkelijkeNaam = klanttype.getNaam();
        // Controleren of de verwachte naam overeenkomt met de daadwerkelijke naam is
        assertEquals(verwachteNaam, daadwerkelijkeNaam);
    }

    @Test
    public void testCreateNewOfferte() { //keanu test gemaakt
        // een string input gemaakt
        String input = "1\n2023-05-24\nTest Company\nTest Address\n123456789\n";

        // de system in voor de createofferte gemaakt
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Invoke the method to create a new Offerte
        Offerte offerte = Offerte.createNewOfferte();

        // Perform assertions to check if the created Offerte has the expected values
        assertEquals(1, offerte.getOffertenr());
        assertEquals("2023-05-24", offerte.getDatum());
        assertEquals("Test Company", offerte.getBedrijfsnaam());
        assertEquals("Test Address", offerte.getAdres());
        assertEquals(123456789, offerte.getTelefoonnr());
    }
    @Test
    public void testMilieuKorting(){
        Onderdeel testOnderdeel = new Onderdeel("testonderdeel", "testonderdeel", Categorie.ESSENTIEEL, 1, 1000, "testonderdeel", 0);
        double verwachtePrijsOverheid = 1000 * 0.8;
        double verwachtePrijsBedrijf = 1000 * 0.9;
        double verwachtePrijsParticulier = 1000 * 1.0;

        assertEquals(Klanttype.getKortingForKlanttype("Overheid")*testOnderdeel.getPrijs(), verwachtePrijsOverheid);
        assertEquals(Klanttype.getKortingForKlanttype("Bedrijf")*testOnderdeel.getPrijs(), verwachtePrijsBedrijf);
        assertEquals(Klanttype.getKortingForKlanttype("Particulier")* testOnderdeel.getPrijs(), verwachtePrijsParticulier);

    }

    @Test
    public void bewerkKlantTest() {
        // Arrange
        ArrayList<Klant> klantenlijst = new ArrayList<>();
        Klant klant = new Klant("John", "Doe", "john@example.com", Klanttype.Particulier);
        klantenlijst.add(klant);

        // Simulate user input using a mocked Scanner
        String userInput = "1\nJohn\nDoe\njohn@example.com\n3\n";
        InputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);


        // Act
        Klant.bewerkKlant(klantenlijst);

        // Assert
        Klant updatedKlant = klantenlijst.get(0);
        assertEquals("John", updatedKlant.getVoornaam());
        assertEquals("Doe", updatedKlant.getAchternaam());
        assertEquals("john@example.com", updatedKlant.getEmail());
        assertEquals(Klanttype.Particulier, updatedKlant.getKlanttype());
    }

}

