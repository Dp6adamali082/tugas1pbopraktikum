public class Anjing { 
    private String nama;
    private String ras;
    private int umur;
    private String warnaBulu;

    //ini kontraksi
    public Anjing(String nama, String ras, int umur, String warnaBulu) {
        this.nama = nama;
        this.ras = ras;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }

    public void getInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Ras: " + ras);
        System.out.println("Umur: " + umur + " tahun");
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
        Anjing anjing1 = new Anjing("Bobby", "Golden Retriever", 3, "Coklat");
        System.out.println("Informasi Anjing 1:");
        anjing1.getInfo();
        System.out.println();

        Anjing anjing2 = new Anjing("Max", "Poodle", 2, "Putih");
        System.out.println("Informasi Anjing 2:");
        anjing2.getInfo();
        System.out.println();

        Anjing anjing3 = new Anjing("Rocky", "Siberian Husky", 5, "Abu-abu dan Putih");
        System.out.println("Informasi Anjing 3:");
        anjing3.getInfo();
        System.out.println();

        anjing1.gonggong();
        anjing2.lari();
        anjing3.tidur();
    }
}
