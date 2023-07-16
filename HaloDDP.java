import java.util.Scanner;

public class HaloDDP {
    public static void main(String[] args) {
        int BASE_PRICE = 5000; 
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang Haloddp. Berapa ukuran lemari obat hari ini? (max row 5) ");
        String masukan = input.next();
        char a = masukan.charAt(0);
        char b = masukan.charAt(2);
        int baris = Character.getNumericValue(a);
        int kolom = Character.getNumericValue(b);
        String [][] mylist = new String[baris][kolom];
        String [] mylist2 = new String[baris+1];
        String []printer = new String[b];
        if (baris < 1 || kolom < 1 || baris > 5) {
            System.out.println("Ukuran lemari tidak valid!");
            System.exit(0);
        }
        // TODO : Implementasi validasi input ukuran lemari

        // TODO : Buat objek lemari dengan ukuran yang sudah ditentukan

        System.out.println("Silahkan tentukan kategori obat untuk setiap rak");
        // TODO : Implementasi input kategori rak\
        for (int i = 1; i <= baris; i++) {
            System.out.print("Rak ke-"+i+": ");
            String kategori = input.next();
            mylist2[i] = kategori; 
            System.out.println("Rak ke-"+i+" adalah rak obat "+ kategori);         
        }
        cetak(mylist2, mylist, baris);    

        while (true) {
            Scanner input3 = new Scanner(System.in);
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Tambah obat");
            System.out.println("2. Lihat obat");
            System.out.println("3. Beli obat");
            System.out.println("99. Keluar");
            System.out.print("Pilih menu: ");
            String menu = input3.nextLine();

            if (menu.equals("1")) {
                // TODO : Implementasi input obat
                Scanner input2 = new Scanner(System.in);
                System.out.print("Masukkan nama obat: ");
                String namaobat = input.next();
                System.out.print("Masukkan kategori obat: ");
                String kategoriobat = input.next();
                for (int i = 1; i <= baris; i++) {
                    if (kategoriobat == mylist2[i]) {
                        System.out.println("Kategori obat valid");
                    }
                }
                System.out.print("Masukkan posisi obat: ");
                String posisi = input.next();
                String[] size = posisi.split(",");
                int depan = Integer.parseInt(size[0]);
                int belakang = Integer.parseInt(size[1]);
                System.out.print("Masukkan stok obat: ");
                int stok = input2.nextInt();

            } else if (menu.equals("2")) {
                // TODO : Implementasi print obat
                cetak(mylist2, mylist, baris);
            } else if (menu.equals("3")) {
                // TODO : Implementasi beli obat
            } else if (menu.equals("99")){
                // TODO : Implementasi keluar
                break;
            } else {
                System.out.println("Menu tidak tersedia");
            }
        }

        input.close();
        System.out.println("Terima kasih telah menggunakan Haloddp!");
    }
    public static void cetak(String []list, String[][]list2, int x){

        for (int j = 0; j < x; j++) {
            System.out.println(list[j+1]);
            System.out.println("==================");
            for (int i = 0; i < x; i++) {
                if (list2[j][i] != null) {
                    System.out.print(list2[j][i]+ " | ");
                } else {
                    System.out.print("kosong | ");
                }
            }
            System.out.println();
            System.out.println("==================");
        }
    }
}