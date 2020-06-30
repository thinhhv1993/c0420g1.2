package casestudy.furamaresot.models;

public class Room extends Services {
    private String saleService;

    public Room(String saleService) {
        this.saleService = saleService;
    }

    public Room(String id, String name, double acreage, int price, int numbPeople, int numbDay, String saleService) {
        super(id, name, acreage, price, numbPeople, numbDay);
        this.saleService = saleService;
    }

    public String getSaleService() {
        return saleService;
    }

    public void setSaleService(String saleService) {
        this.saleService = saleService;
    }

    @Override
    public void showInfor() {
        System.out.println("Room{" +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", acreage=" + this.getAcreage() +
                ", price=" + this.getPrice() +
                ", numbPeople=" + this.getNumbPeople() +
                ", numbDay=" + this.getNumbDay() +
                "saleService='" + saleService + '\'' +
                '}');
    }
}
