package com.company;

public class Main {

    public static void main(String[] args) {

        Shelter shelter = new Shelter("help animals","Isanova street");


        Dog Barbos = new Dog("Barbos","Labrador", new String[]{"sit down","lay down"}, shelter, ColorEnum.WHITE);
        Barbos.makevoice("Gav- gav",3);
        System.out.println(Barbos.getInfo());
        System.out.println("____________________________");

      Dog alabay = new Dog("Rex","Alabai",new String[]{"Attack","Eat"},shelter,ColorEnum.WHITE);
        System.out.println(alabay.getInfo());




    }
}
