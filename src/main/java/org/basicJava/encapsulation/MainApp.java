package org.basicJava.encapsulation;

public class MainApp {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("password");

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        User pengguna = new User();
        pengguna.setUsername("root");
        pengguna.setPassword("root123");

        System.out.println("============================");
        System.out.println(pengguna.getUsername());
        System.out.println(pengguna.getPassword());
    }
}
