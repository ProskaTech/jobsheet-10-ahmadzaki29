/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
public class MobilUtama {
    public static void main(String[] args) {
        Mobil Honda = new Mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunproduksi = 2020;
        System.out.println("Merek\t: " + Honda.merk);
        System.out.println("Warna\t: " + Honda.warna);
        System.out.println("tahun\t: " + Honda.tahunproduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
