package casestudy.furamaresot.models;

import java.io.Serializable;
import java.util.Objects;

public class Villa extends Services implements Serializable {
    private String standardRoom;
    private String convenient;
    private String acreagePool;
    private int numbFloor;

    public Villa(String standardRoom, String convenient, String acreagePool, int numbFloor) {
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.acreagePool = acreagePool;
        this.numbFloor = numbFloor;
    }

    public Villa(String id, String name, double acreage, int price, int numbPeople, int numbDay, String standardRoom, String convenient, String acreagePool, int numbFloor) {
        super(id, name, acreage, price, numbPeople, numbDay);
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.acreagePool = acreagePool;
        this.numbFloor = numbFloor;
    }

    public Villa(String id, String name, double acreage, int price, int people, String standardRoom, String convenient, String acreagePool, int numbfloor) {
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

    public String getAcreagePool() {
        return acreagePool;
    }

    public void setAcreagePool(String acreagePool) {
        this.acreagePool = acreagePool;
    }

    public int getNumbFloor() {
        return numbFloor;
    }

    public void setNumbFloor(int numbFloor) {
        this.numbFloor = numbFloor;
    }

    @Override
    public void showInfor() {
        System.out.println("Villa{" +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", acreage=" + this.getAcreage() +
                ", price=" + this.getPrice() +
                ", numbPeople=" + this.getNumbPeople() +
                ", numbDay=" + this.getNumbDay() +
                ",standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", acreagePool='" + acreagePool + '\'' +
                ", numbFloor=" + numbFloor +
                '}');
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Villa) {
            Villa otherVilla = (Villa) obj;
            if (this.getId().equals(otherVilla.getId())) {
                return true;
            }
        }
        return false;
    }

}
