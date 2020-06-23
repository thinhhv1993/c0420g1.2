package bai10.mapvstree.baitap;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int cost;
    public Product(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public int compareTo(Product o) {
        return this.cost-o.cost;
    }
<<<<<<< HEAD


=======
>>>>>>> 6b86d13f9e839cd26daa0597a48f0053f3522904
}
