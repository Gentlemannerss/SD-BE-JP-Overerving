package nl.novi.javaprogrammeren.overerving;

public class Dog extends Animal {
    String bossName;
    String favouriteFood;
    String race;

    public Dog(String name, Character nameOfSex, Boolean zooAnimal, String bossName, String favouriteFood, String race) {
        super(name, nameOfSex, zooAnimal);
        this.bossName = bossName;
        this.favouriteFood = favouriteFood;
        this.race = race;
    }

    @Override
    public void move() {
        System.out.println("The dog moved for 0.25 meters.");
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog barked.");
    }

    @Override
    public void whatToEat() {
        System.out.println("The dog eats dogfood.");
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return
    }
}
