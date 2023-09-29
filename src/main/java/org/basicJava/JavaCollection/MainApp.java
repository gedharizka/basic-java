package org.basicJava.JavaCollection;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        // add item
        cars.add("volvo");
        cars.add("bmw");
        cars.add("ford");
        cars.add("mazda");

        System.out.println(cars);
        System.out.println(cars.get(1));
        //index, new_value
        cars.set(0,"Fiat");
        System.out.println(cars);
        //cars.remove(2);

        // menu CRUD(Input) (Looping)
        /*
        * 1. Tampilkan data nama produk
        * 2. Menambah
        * 3. Update
        * 4. Hapus data nama
        * 5. Keluar dari program
        * */
    }
}
