package com.company;

import java.util.Arrays;

public class Dog extends Pet{
    private String name;
    private String breed;
    private String [] commands;


    public Dog(String name, String breed, String[] commands, Shelter shelter, ColorEnum colorEnum){
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;

    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nName: "+name+
                "\nBreed:"+breed+
                "\nCommands:"+ Arrays.toString(commands);
    }

    public void makevoice(String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }
}
