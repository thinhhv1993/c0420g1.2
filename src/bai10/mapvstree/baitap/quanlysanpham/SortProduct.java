package bai10.mapvstree.baitap.quanlysanpham;

import java.util.Comparator;

public class SortProduct extends Product implements Comparator<Product> {
    @Override
    public int compare(Product o, Product o1) {
        return o.cost-o1.cost;
    }
}
