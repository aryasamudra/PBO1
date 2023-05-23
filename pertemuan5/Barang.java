public class Barang {
    String tipe_barang;
String jenis;
int thnproduksi;
    public static void main(String[] args) {


Barang barang = new Barang();
barang.tipe_barang = "Stop Kontak";
barang.jenis = "Elektronik";
barang.thnproduksi = 2021;
System.out.println("Tipe Barang: " + barang.tipe_barang);
System.out.println("Jenis Barang: " + barang.jenis);
System.out.println("Tahun Produksi Barang: " + barang.thnproduksi);
}}