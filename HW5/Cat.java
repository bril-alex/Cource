package HW5;

public class Cat extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Cat(boolean vegetarian, String eats, int noOflegs, String color) {
        super(vegetarian, eats, noOflegs);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOflegs) {
        this(vegetarian, eats, noOflegs,"white");
    }
}
