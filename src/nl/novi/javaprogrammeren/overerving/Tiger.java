package nl.novi.javaprogrammeren.overerving;

public class Tiger extends Animal {
    String nameOfCage;
    String dayOfFeeding;
    String landOfOrigin;
    Integer howManyStripes;

    public Tiger(String name, Character nameOfSex, Boolean zooAnimal, String nameOfCage, String dayOfFeeding, String landOfOrigin, Integer howManyStripes) {
        super(name, nameOfSex, zooAnimal);
        this.nameOfCage = nameOfCage;
        this.dayOfFeeding = dayOfFeeding;
        this.landOfOrigin = landOfOrigin;
        this.howManyStripes = howManyStripes;
    }

    @Override
    public void move() {
        System.out.println("The tiger moved for 0.25 meters.");
    }

    @Override
    public void makeNoise() {
        System.out.println("The tiger growls.");
    }

    @Override
    public void whatToEat() {
        System.out.println("The tiger eats meat.");
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

    public Integer getHowManyStripes() {
        return howManyStripes;
    }

    public void setHowManyStripes(Integer howManyStripes) {
        this.howManyStripes = howManyStripes;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "Sex " + getNameOfSex() + "Zoo animal " + getZooAnimal() + "Name of Cage " + nameOfCage + "Day of Feeding" + dayOfFeeding + "Land of Origin" + landOfOrigin + "How many Stripes" + howManyStripes;
    }
}
