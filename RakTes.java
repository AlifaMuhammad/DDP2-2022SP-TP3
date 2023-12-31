import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class RakTes {
 
    private Rak rak;

    @Before
    public void setUp() {
        rak = new Rak(5, "Rak Obat");
    }

    @Test
    public void testGetKategoriRak() {
        String expectedKategori = "Rak Obat";
        String actualKategori = rak.getKategoriRak();
        assertEquals(expectedKategori, actualKategori);
    }


    @Test
    public void testcariobat() {
        Obat obat1 = new Obat("Paracetamol", 20, "panadol");

        boolean expectedKategori = false;
        boolean actualKategori = rak.cariObat(obat1);

        assertEquals(expectedKategori, actualKategori);
    }

    @Test
    public void testsearchobat() {
        Obat obat1 = new Obat("Paracetamol", 20, "panadol");

        String expected = null;
        Obat actual = rak.searchObat("paracetamol");

        assertEquals(expected, actual);
    }

    @Test
    public void testBeliObat(){
        Obat obat1 = new Obat("Paracetamol", 5, "panadol");
        Obat obat2 = new Obat("Amoxicillin", 20, "vitamin");
        
        boolean expectedKategori = false;
        boolean actualKategori = rak.beliObat(obat1, 15);
        
        assertEquals(expectedKategori, actualKategori);
    }
}