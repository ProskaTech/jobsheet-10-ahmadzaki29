/**
 *
 * Created by Ahmad Zaki Alfaruq_21343079
 */
public class sks {
    String nama = "Joni", smt = "V";
    int nim = 12345, sks;
    double ip = 3.50;
    
    public void hitungSks(){
        if(ip >= 3.5){
            sks = 24;
        }
        else if(ip >= 3.0){
            sks = 22;
        }
        else if(ip >= 2.5){
            sks = 20;
        }
        else if(ip >= 2.0){
            sks = 18;
        }
        else {
            sks = 15;
        }
    }
    public void tampilData(){
        System.out.println("Nama mahasiswa \t\t: " +nama);
        System.out.println("NIM \t\t\t: " +nim);
        System.out.println("Semester \t\t: " +smt);
        System.out.println("IP Semester ini \t: " +ip);
        System.out.println("Anda berhak mengontrak " +sks+ " SKS pada Semester " +smt);
    }
    
    public static void main(String args[]){
        sks a = new sks();
        a.hitungSks();
        a.tampilData();
    }
}
