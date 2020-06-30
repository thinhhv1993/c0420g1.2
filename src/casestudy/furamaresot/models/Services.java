package casestudy.furamaresot.models;

public abstract class Services {
    private String id ;
    private String name;
    private double acreage;
    private int price;
    private int numbPeople;
    private int numbDay;

    public Services() {
    }

    public Services(String id, String name, double acreage, int price, int numbPeople, int numbDay) {
        this.id = id;
        this.name = name;
        this.acreage = acreage;
        this.price = price;
        this.numbPeople = numbPeople;
        this.numbDay = numbDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumbPeople() {
        return numbPeople;
    }

    public void setNumbPeople(int numbPeople) {
        this.numbPeople = numbPeople;
    }

    public int getNumbDay() {
        return numbDay;
    }

    public void setNumbDay(int numbDay) {
        this.numbDay = numbDay;
    }

    public abstract void showInfor();

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", acreage=" + acreage +
                ", price=" + price +
                ", numbPeople=" + numbPeople +
                ", numbDay=" + numbDay +
                '}';
    }
}
