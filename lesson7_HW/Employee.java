package lesson7_HW;

public abstract class Employee {
    public final String name;

    protected Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return "";
    }
    public abstract String getPosition();
    public abstract String getSeniority();
    public String getInfo(){
        return getName();
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
