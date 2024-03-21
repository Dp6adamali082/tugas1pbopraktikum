import java.time.LocalDate;

public class Anjing {
    private String nama;
    private String ras;
    private LocalDate tanggalLahir;
    private String warnaBulu;

    public Anjing(String nama, String ras, LocalDate tanggalLahir, String warnaBulu) {
        this.nama = nama;
        this.ras = ras;
        this.tanggalLahir = tanggalLahir;
        this.warnaBulu = warnaBulu;
    }

    public void getInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Ras: " + ras);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Warna Bulu: " + warnaBulu);
    }

    public void gonggong() {
        System.out.println(nama + " sedang menggonggong: Woof! Woof!");
    }

    public void lari() {
        System.out.println(nama + " sedang berlari dengan cepat!");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur. Zzz...");
    }

    public static void main(String[] args) {
        // Membuat objek Anjing dengan menggunakan LocalDate untuk tanggal lahir
        Anjing anjing1 = new Anjing("Bobby", "Golden Retriever", LocalDate.of(2019, 5, 15), "Coklat");
        Anjing anjing2 = new Anjing("Max", "Poodle", LocalDate.of(2020, 8, 20), "Putih");
        Anjing anjing3 = new Anjing("Rocky", "Siberian Husky", LocalDate.of(2017, 3, 10), "Abu-abu dan Putih");

        // Menampilkan informasi anjing
        System.out.println("Informasi Anjing 1:");
        anjing1.getInfo();
        System.out.println();

        System.out.println("Informasi Anjing 2:");
        anjing2.getInfo();
        System.out.println();

        System.out.println("Informasi Anjing 3:");
        anjing3.getInfo();
        System.out.println();
    }
}
