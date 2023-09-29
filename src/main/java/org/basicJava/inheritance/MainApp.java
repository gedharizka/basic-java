package org.basicJava.inheritance;

public class MainApp {
    public static void main(String[] args) {
    Karyawan karyawan = new Karyawan();
    karyawan.name = "Admin";
    karyawan.jenisKelamin="laki-laki";
    karyawan.gaji = 15000;
    System.out.println("Gaji " + karyawan.gaji);
    double kenaPajak = karyawan.hitungPajak(karyawan.gaji, karyawan.jenisKelamin);
    System.out.println("kena pajak :"+ kenaPajak);
    System.out.println("Gaji bersih karyawan:"+ karyawan.gajiBersih(karyawan.gaji, kenaPajak));
    System.out.println("=======================================");

    Manager manager = new Manager();
    manager.name = "Nama Manager";
    manager.jenisKelamin = "perempuan";
    manager.gaji = 20000;

    double pajakPenghasilan = manager.hitungPajak(manager.gaji, manager.jenisKelamin);

    }
}
