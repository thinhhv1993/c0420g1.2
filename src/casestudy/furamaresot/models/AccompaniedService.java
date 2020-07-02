package casestudy.furamaresot.models;

public class AccompaniedService {
    private String name;
    private String unit;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public AccompaniedService(String name, String unit, int price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                " unit='" + unit + '\'' +
                " price=" + price +
                '}';
    }
    public static final AccompaniedService massage = new AccompaniedService("massage","1",10);
    public static final AccompaniedService karaoke = new AccompaniedService("karaoke","1",10);
    public static final AccompaniedService food = new AccompaniedService("food","1",10);
    public static final AccompaniedService drink = new AccompaniedService("drink","1",10);
    public static final AccompaniedService car = new AccompaniedService("car","1",10);
}
