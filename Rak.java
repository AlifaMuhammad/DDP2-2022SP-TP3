public class Rak {
    private int size;
    private String kategori;
    private Obat[] daftarObat;

    public Rak(int size, String kategori){
        this.kategori = kategori;
        this.daftarObat = new Obat[size];
        this.size = size;
    }

    // TODO : Implementasi method getKategoriRak
    public String getKategoriRak() {
        return "";
    }

    // TODO : Implementasi method tambahObat
    public void tambahObat(Obat obat, int index) {
        this.daftarObat[index] = obat;

    }
    
    // TODO : Implementasi method printRak
    public void printRak(){
        for (int i = 0; i < size; i++) {
            Obat obat = daftarObat[i];
            if (obat != null) {
                System.out.println(i + 1 +);
            }
        }
    }

    // TODO : Implementasi method getListObat
    public Obat[] getListObat() {
        return null;
    }
    
}
