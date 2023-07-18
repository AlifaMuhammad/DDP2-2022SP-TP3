import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class ObatTes {
    @Test
    public void testGetKategori() {
        String expectedKategori = "Antibiotik";
        Obat obat = new Obat("Amoxicillin", 50, expectedKategori);
        String actualKategori = obat.getKategori();
        assertEquals(expectedKategori, actualKategori);
    }

    @Test
    public void testGetNama() {
        String expectedNama = "Paracetamol";
        Obat obat = new Obat(expectedNama, 100, "Pil");
        String actualNama = obat.getNama();
        assertEquals(expectedNama, actualNama);
    }

    @Test
    public void testGetHarga() {
        int expectedHarga = 15000;
        Obat obat = new Obat("Ibuprofen", 30, "Obat Antiinflamasi");
        obat.setHarga(expectedHarga);
        int actualHarga = obat.getHarga();
        assertEquals(expectedHarga, actualHarga);
    }

    @Test
    public void testGetStok() {
        int expectedStok = 20;
        Obat obat = new Obat("Vitamin C", expectedStok, "Suplemen");
        int actualStok = obat.getStok();
        assertEquals(expectedStok, actualStok);
    }
    
    @Test
    public void testSetKategori() {
        String expectedKategori = "Analgesik";
        Obat obat = new Obat("Aspirin", 10, "Obat Pereda Nyeri");
        obat.setKategori(expectedKategori);
        String actualKategori = obat.getKategori();
        assertEquals(expectedKategori, actualKategori);
    }

    @Test
    public void testSetStok() {
        int expectedStok = 50;
        Obat obat = new Obat("Loperamide", 30, "Obat Diare");
        obat.setStok(expectedStok);
        int actualStok = obat.getStok();
        assertEquals(expectedStok, actualStok);
    }

    @Test
    public void testSetHarga() {
        int expectedHarga = 25000;
        Obat obat = new Obat("Antasida", 20, "Obat Maag");
        obat.setHarga(expectedHarga);
        int actualHarga = obat.getHarga();
        assertEquals(expectedHarga, actualHarga);
    }
}
