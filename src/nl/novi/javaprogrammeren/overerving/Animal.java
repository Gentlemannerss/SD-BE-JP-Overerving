package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
    private String name;
    private Character nameOfSex;
    private Boolean zooAnimal;
    /*private String distance = "0.25 meter"*/

    public Animal(String name, Character nameOfSex, Boolean zooAnimal) {
        this.name = name;
        this.nameOfSex = nameOfSex;
        this.zooAnimal = zooAnimal;
    }

    public abstract void move();
    public abstract void makeNoise();
    public void sleep() {
        System.out.println("The animal is sleeping for 8 hours");
    }
    public abstract void whatToEat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getNameOfSex() {
        return nameOfSex;
    }

    public void setNameOfSex(Character nameOfSex) {
        this.nameOfSex = nameOfSex;
    }

    public Boolean getZooAnimal() {
        return zooAnimal;
    }

    public void setZooAnimal(Boolean zooAnimal) {
        this.zooAnimal = zooAnimal;
    }
}
