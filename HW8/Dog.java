package HW8;

public class Dog extends Animal implements Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Dog " + getName() + " says: Woof");
    }
    void greets(Dog dog1) {
        System.out.println(dog1.getName()+ " says: Woooooof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog " + getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking dog " + getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with dog " + getName());
    }
}
