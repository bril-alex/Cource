package HW8;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woow");
    }
    void greets(Dog Dog) {
        System.out.println("Woooow");
    }
    void greets(BigDog bigDog) {
        System.out.println("Wooooooow");
    }
}
