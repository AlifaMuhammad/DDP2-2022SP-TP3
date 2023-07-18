public class Lemari {
    private int ukuran;
    private Rak[] rak;

    public Lemari(int ukuran){
        this.ukuran = ukuran;
        rak = new Rak[ukuran];
    }
    /**
     * method addRak yang akan menambahkan objek Rak ke dalam array rak pada indeks yang ditentukan. 
     * Method ini menerima objek Rak dan indeks sebagai parameter
     */
    public void addRak(Rak rak, int index){
        this.rak[index] = rak;
    }

    public void print(){
        System.out.println("Rak obat hari ini berukuran " + ukuran + "x" + rak[0].getSize());
        for (int i = 0; i < ukuran; i++) {
            System.out.println(rak[i].getKategoriRak());
            System.out.println("==================");
            rak[i].printRak();
            System.out.println("==================");
        }
    }

    /**
     * method beliObat yang memungkinkan pengguna untuk membeli obat dari lemari   
     * berdasarkan nama obat dan jumlah yang diinginkan.
     * Method ini menerima parameter namaObat dan jumlah dan akan mencari obat yang sesuai dalam rak
     * dan mengurangi stok obat sesuai dengan jumlah yang dibeli.
     */
    public boolean beliObat(Obat obat, int jumlah) {
        Rak rakObat = null;
        for (Rak rak : rak) {
            if (rak.cariObat(obat)) {
                rakObat = rak;
                break;
            }
        }
        if (rakObat != null) {
            return rakObat.beliObat(obat, jumlah);
        }
        return false;
    } 


    /**
     * method searchObat yang digunakan untuk mencari obat dalam lemari berdasarkan nama obat. 
     * Method ini menerima parameter namaObat dan akan memeriksa setiap rak dalam lemari 
     * untuk mencari obat yang sesuai.
     */
    public Obat searchObat(String namaObat) {
        for (Rak rak : rak) {
            Obat obat = rak.searchObat(namaObat);
            if (obat != null) {
                return obat;
            }
        }
        return null;
    }

    /**
     * method getRak yang digunakan untuk mendapatkan objek Rak pada indeks yang ditentukan dalam array rak.
     * Method ini menerima parameter i dan akan mengembalikan objek Rak pada indeks tersebut.
     */
    public Rak getRak(int i) {
        return rak[i];
    }
}
