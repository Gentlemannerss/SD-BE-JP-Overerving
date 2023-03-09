package nl.novi.javaprogrammeren.overerving;

public class Cat extends Animal {
    String bossName;
    String favouriteFood;
    String race;
    String indoorOrOutdoor;

    public Cat(String name, Character nameOfSex, Boolean zooAnimal, String bossName, String favouriteFood, String race, String indoorOrOutdoor) {
        super(name, nameOfSex, zooAnimal);
        this.bossName = bossName;
        this.favouriteFood = favouriteFood;
        this.race = race;
        this.indoorOrOutdoor = indoorOrOutdoor;
    }

    @Override
    public void move() {
        System.out.println("The cat moved for 0.25 meters.");
    }

    @Override
    public void makeNoise() {
        System.out.println("The cat purrs.");
    }

    @Override
    public void whatToEat() {
        System.out.println("The cat eats catfood.");
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

    public String getIndoorOrOutdoor() {
        return indoorOrOutdoor;
    }

    public void setIndoorOrOutdoor(String indoorOrOutdoor) {
        this.indoorOrOutdoor = indoorOrOutdoor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "bossName='" + bossName + '\'' +
                ", favouriteFood='" + favouriteFood + '\'' +
                ", race='" + race + '\'' +
                ", indoorOrOutdoor='" + indoorOrOutdoor + '\'' +
                '}';
    }
}
