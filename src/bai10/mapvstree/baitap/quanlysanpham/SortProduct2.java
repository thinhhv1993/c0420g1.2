package bai10.mapvstree.baitap.quanlysanpham;

import java.util.Comparator;

public class SortProduct2 extends Product implements Comparator<Product> {
    @Override
    public int compare(Product o, Product o1) {
        return o1.cost-o.cost;
    }
}
