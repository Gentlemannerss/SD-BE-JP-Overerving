package nl.novi.javaprogrammeren.overerving;

public class Wolf extends Animal {
    String nameOfCage;
    String dayOfFeeding;
    String landOfOrigin;
    String nameOfPack;

    public Wolf(String name, Character nameOfSex, Boolean zooAnimal, String nameOfCage, String dayOfFeeding, String landOfOrigin, String nameOfPack) {
        super(name, nameOfSex, zooAnimal);
        this.nameOfCage = nameOfCage;
        this.dayOfFeeding = dayOfFeeding;
        this.landOfOrigin = landOfOrigin;
        this.nameOfPack = nameOfPack;
    }

    @Override
    public void move() {
        System.out.println("The wolf moved for 0.25 meters.");
    }

    @Override
    public void makeNoise() {
        System.out.println("The wolf howls.");
    }

    @Override
    public void whatToEat() {
        System.out.println("The wolf eats rabbits.");
    }

    public String getNameOfCage() {
        return nameOfCage;
    }

    public void setNameOfCage(String nameOfCage) {
        this.nameOfCage = nameOfCage;
    }

    public String getDayOfFeeding() {
        return dayOfFeeding;
    }

    public void setDayOfFeeding(String dayOfFeeding) {
        this.dayOfFeeding = dayOfFeeding;
    }

    public String getLandOfOrigin() {
        return landOfOrigin;
    }

    public void setLandOfOrigin(String landOfOrigin) {
        this.landOfOrigin = landOfOrigin;
    }

    public String getNameOfPack() {
        return nameOfPack;
    }

    public void setNameOfPack(String nameOfPack) {
        this.nameOfPack = nameOfPack;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + getName() + '\'' +
                ", nameOfSex='" + getNameOfSex() + '\'' +
                ", zooAnimal='" + getZooAnimal() + '\'' +
                ", nameOfCage='" + nameOfCage + '\'' +
                ", dayOfFeeding='" + dayOfFeeding + '\'' +
                ", landOfOrigin='" + landOfOrigin + '\'' +
                ", nameOfPack='" + nameOfPack + '\'' +
                '}';
    }
}
