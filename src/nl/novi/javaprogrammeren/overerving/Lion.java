package nl.novi.javaprogrammeren.overerving;

public class Lion extends Animal {
    String nameOfCage;
    String dayOfFeeding;
    String landOfOrigin;
    Integer childeren;

    public Lion(String name, Character nameOfSex, Boolean zooAnimal, String nameOfCage, String dayOfFeeding, String landOfOrigin, Integer childeren) {
        super(name, nameOfSex, zooAnimal);
        this.nameOfCage = nameOfCage;
        this.dayOfFeeding = dayOfFeeding;
        this.landOfOrigin = landOfOrigin;
        this.childeren = childeren;
    }

    @Override
    public void move() {
        System.out.println("The lion moved for 0.25 meters.");
    }

    @Override
    public void makeNoise() {
        System.out.println("The lion growls.");
    }

    @Override
    public void whatToEat() {
        System.out.println("The lion eats meat.");
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

    public Integer getChilderen() {
        return childeren;
    }

    public void setChilderen(Integer childeren) {
        this.childeren = childeren;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "nameOfCage='" + nameOfCage + '\'' +
                ", dayOfFeeding='" + dayOfFeeding + '\'' +
                ", landOfOrigin='" + landOfOrigin + '\'' +
                ", childeren=" + childeren +
                '}';
    }
}
