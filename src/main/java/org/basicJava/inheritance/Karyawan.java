package org.basicJava.inheritance;

public class Karyawan {
    String name;
    String address;

    String jenisKelamin;
    double gaji;

    //hitung pajak dan hitung gaji bersih
    double hitungPajak(double salary, String kelamin){
        double pajak = 0;
        double persentasePajak = 0;

        if (salary >= 7000) {
            if (kelamin == "laki-laki") {
                persentasePajak = 0.07;
                pajak = salary * persentasePajak;
                System.out.println("Pajaknya yang harus dibayar:"+pajak);
            }else if (kelamin == "perempuan"){
                persentasePajak = 0.5;
                pajak = salary * persentasePajak;
                System.out.println("Pajaknya yang harus dibayar:"+pajak);
            }
        }else {
            System.out.println("tidak kena pajak");
        }
        return pajak;
    }

    double gajiBersih (double grossSalary, double pajak){
        return   grossSalary - pajak;
    }
}
