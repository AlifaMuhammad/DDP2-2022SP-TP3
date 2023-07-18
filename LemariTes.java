import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class LemariTes {
    private Lemari lemari;
    private Obat obat1, obat2;
    private Rak rak1, rak2;

    @Before
    public void setUp() {
        lemari = new Lemari(2);

        obat1 = new Obat("Paracetamol", 50, "Obat Umum");
        obat2 = new Obat("Amoxicillin", 30, "Antibiotik");

        rak1 = new Rak(5, "Rak Obat Umum");
        rak2 = new Rak(3, "Rak Antibiotik");

        rak1.tambahObat(obat1, 0);
        rak2.tambahObat(obat2, 1);

        lemari.addRak(rak1, 0);
        lemari.addRak(rak2, 1);
    }

    @Test
    public void testBeliObat() {
        // Membeli obat dari rak
        assertTrue(lemari.beliObat(obat1, 20));

        // Memeriksa stok obat setelah pembelian
        assertEquals(30, obat1.getStok());
    }

    @Test
    public void testSearchObat() {
        String namaObat = "Amoxicillin";
        Obat foundObat = lemari.searchObat(namaObat);

        assertNotNull(foundObat);
        assertEquals(namaObat, foundObat.getNama());
    }
}
