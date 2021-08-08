package com.company;

import java.util.Random;

public class Pet {
    private int age = generateRandomAge();
    private ColorEnum colorEnum;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(10)+1;

    }
    public String getInfo(){
        if (shelter != null){
            return "Age: " + age +
                    "\nColor: " + colorEnum +
                    "\nShelter name: " + shelter.getName() +
                    "\nShelter address: " + shelter.getAddress();
        }else {
            return "Age: " + age +
                    "\nColor: " + colorEnum;
        }
    }

    }

