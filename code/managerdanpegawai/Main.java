import java.text.DecimalFormat;

class Pegawai {
    private String nama;
    private double gajiPokok;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void cetakInfo() {
        DecimalFormat df = new DecimalFormat("#.##");  
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + df.format(gajiPokok));
    }
}

class Manager extends Pegawai {
    private double tunjangan;

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public void cetakInfo() {
        DecimalFormat df = new DecimalFormat("#.##"); 
        super.cetakInfo(); 
        System.out.println("Tunjangan: " + df.format(tunjangan));
    }
}

class Programmer extends Pegawai {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void cetakInfo() {
        DecimalFormat df = new DecimalFormat("#.##"); 
        super.cetakInfo(); 
        System.out.println("Bonus: " + df.format(bonus));
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setNama("Fajar");
        manager.setGajiPokok(15000000);
        manager.setTunjangan(5000000);

        System.out.println("Informasi Manager:");
        manager.cetakInfo(); 

        System.out.println();

        Programmer programmer = new Programmer();
        programmer.setNama("Antor");
        programmer.setGajiPokok(9000000);
        programmer.setBonus(6000000);

        System.out.println("Informasi Programmer:");
        programmer.cetakInfo();
    }
}