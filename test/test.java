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
}

