package HW5;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOflegs;

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOflegs() {
        return noOflegs;
    }

    public void setNoOflegs(int noOflegs) {
        this.noOflegs = noOflegs;
    }

    public Animal(boolean vegetarian, String eats, int noOflegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOflegs = noOflegs;
    }

    public Animal() {
    }
}
