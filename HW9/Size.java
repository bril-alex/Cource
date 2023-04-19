package HW9;

public enum Size {
    SMALL("S",10,20),
    MEDIUM("M",20,30),
    LARGE("L",30,40),
    EXTRA_LARGE("XL",40,50);

    private String sizeName;
    private int width,length;

    Size(String sizeName, int width, int length) {
        this.sizeName = sizeName;
        this.width = width;
        this.length = length;
    }

    public String getSizeName() {
        return sizeName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return getSizeName() +  " size: " + "\n width= " + getWidth() + "\n length= " + getLength();
    }
}
