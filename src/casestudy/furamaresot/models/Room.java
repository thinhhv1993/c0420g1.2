package casestudy.furamaresot.models;

public class Room extends Services implements Comparable<Room> {
    private String saleService;

    public Room(String saleService) {
        this.saleService = saleService;
    }

    public Room(String id, String name, double acreage, int price, int numbPeople, int numbDay, String aService, String saleService) {
        super(id, name, acreage, price, numbPeople, numbDay, aService);
        this.saleService = saleService;
    }

    public Room(String id, String name, double acreage, int price, int numbPeople, int numbDay, String s,AccompaniedService aService, String saleService) {
    }

    public Room(String id, String name, double acreage, int price, int numbPeople, int numbDay, String s, String s1, String saleService) {

    }


    public String getSaleService() {
        return saleService;
    }

    public void setSaleService(String saleService) {
        this.saleService = saleService;
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", acreage=" + this.getAcreage() +
                ", price=" + this.getPrice() +
                ", numbPeople=" + this.getNumbPeople() +
                ", numbDay=" + this.getNumbDay() +
                ", AccompaniedService=" + this.getaService() +
                "saleService='" + saleService + '\'' +
                '}';
    }

    @Override
    public int compareTo(Room o) {
        return this.getName().compareTo(o.getName());
    }
}
