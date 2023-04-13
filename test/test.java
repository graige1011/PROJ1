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
        // Test setting and getting voorNaam
        klant.setVoorNaam("Johnny");
        assertEquals("Johnny", klant.getVoorNaam(), "VoorNaam should be 'Johnny'");
    }

    @Test
    public void testAchterNaam() {
        // Test setting and getting achterNaam
        klant.setAchterNaam("Smith");
        assertEquals("Smith", klant.getAchterNaam(), "AchterNaam should be 'Smith'");
    }

    @Test
    public void testEmail() {
        // Test setting and getting email
        klant.setEmail("johnsmith@example.com");
        assertEquals("johnsmith@example.com", klant.getEmail(), "Email should be 'johnsmith@example.com'");
    }
    @Test
    public void testVoegKlanttypeToe() {
        Klanttype klanttype = new Klanttype("Test", 0.5);
        Klanttype.voegKlanttypeToe(klanttype);

        ArrayList<Klanttype> klanttypes = Klanttype.getKlanttypes();
        assertTrue(klanttypes.contains(klanttype));
    }
    @Test
    public void testGetKlanttypeNaam() {
        Klanttype klanttype = new Klanttype("Student", 0.75);
        String verwachteNaam = "Student";
        String daadwerkelijkeNaam = klanttype.getNaam();

        assertEquals(verwachteNaam, daadwerkelijkeNaam);
    }
}

