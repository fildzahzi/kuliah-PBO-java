package tugasconstructorfildzah;

/* @author Predator Ryzen 5600H
 */
public class dataTBBB {
    //membuat variable

    String nama;
    String tb, bb;

    //membuat contructor: 
    //suatu metode khusus yang akan dijalankan secara otomatis pada saat objek tersebut diciptakan
    //Syarat Constructor : (1) nama constructor harus sama dengan nama class yaitu Mahasiswa
    //Syarat Constructor : (2) constructor tidak memiliki nilai balikan (void atau tipe data yang lain)
    public dataTBBB() {
        this.nama = "Nama Belum diisi";
        this.tb = "Tinggi Badan Belum diisi";
        this.bb = "Berat Badan Belum diisi";
    }

    //membuat constructor 2 untuk input data (menggunakan parameter)
    public dataTBBB(String nm, String tiba, String beba) {
        this.nama = nm;
        this.tb = tiba;
        this.bb = beba;
    }

    public String getNama() {
        return this.nama;
    }

    public String getTB() {
        return this.tb;
    }
    
    public String getBB(){
        return this.bb;
    }
}
