public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dengan menggunakan konstruktor
        Mahasiswa fajar = new Mahasiswa("Fajar Julianwar", "Laki-Laki", 19, "Cikarang Timur", "Teknik Informatika", "312310672");

        // Memanggil metode untuk mencetak informasi
        fajar.cetakInfo();
        System.out.println("NIM             : " + fajar.getNim());
        System.out.println("Jurusan         : " + fajar.getJurusan());
    }
}