import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class test {

    private InputStream inputStream;

    @BeforeEach
    public void setUp() {
        // Set up input stream for testing user input
        String input = "Ja\nTest Naam\nTest Omschrijving\nESSENTIEEL\n5\n10.99\nTest Soort\n50\n";
        inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
    }

    @Test
    public void testNieuwOnderdeel() {
        Onderdeel nieuwOnderdeel = new Onderdeel("Test Naam","Test Omschrijving",Categorie.ESSENTIEEL,5,10.0,"Test Soort",50);

        // Assertions
        assertNotNull(nieuwOnderdeel);
        assertEquals("Test Naam", nieuwOnderdeel.getNaam());
        assertEquals("Test Omschrijving", nieuwOnderdeel.getOmschrijving());
        assertEquals(Categorie.ESSENTIEEL, nieuwOnderdeel.getCategorie());
        assertEquals(5, nieuwOnderdeel.getAantal());
        assertEquals(10.0, nieuwOnderdeel.getPrijs(), 0.001); // Double comparison with delta
        assertEquals("Test Soort", nieuwOnderdeel.getSoortOnderdeel());
        assertEquals(50, nieuwOnderdeel.getMilieuKorting());
    }


}
