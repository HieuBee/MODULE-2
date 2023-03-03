package arraylish_or_linkedlist;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPriceProduct() == o1.getPriceProduct()) {
            return 0;
        } else if (o1.getPriceProduct() > o2.getPriceProduct()) {
            return 17;
        } else {
            return -17;
        }
    }
}
