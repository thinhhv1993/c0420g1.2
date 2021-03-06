package casestudy.furamaresot.models;

import java.io.Serializable;

public class House extends Services implements Comparable<House>, Serializable {
    private String standardRoom;
    private String convenient;
    private int numbFloor;

    public House(String standardRoom, String convenient, int numbFloor) {
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.numbFloor = numbFloor;
    }

    public House(String id, String name, double acreage, int price, int numbPeople, int numbDay, String aService, String standardRoom, String convenient, int numbFloor) {
        super(id, name, acreage, price, numbPeople, numbDay, aService);
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.numbFloor = numbFloor;
    }

    public House() {
    }


    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public int getNumbFloor() {
        return numbFloor;
    }

    public void setNumbFloor(int numbFloor) {
        this.numbFloor = numbFloor;
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof House) {
            House otherHouse = (House) obj;
            if (this.getId().equals(otherHouse.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", acreage=" + this.getAcreage() +
                ", price=" + this.getPrice() +
                ", numbPeople=" + this.getNumbPeople() +
                ", numbDay=" + this.getNumbDay() +
                ", AccompaniedService=" + this.getaService() +
                "standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", numbFloor=" + numbFloor +
                '}';
    }

    @Override
    public int compareTo(House o) {
        return o.getName().compareTo(this.getName());
    }
}
