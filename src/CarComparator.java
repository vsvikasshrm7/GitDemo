import java.util.Comparator;

public class CarComparator implements Comparator<Cars> {
    @Override
    public int compare(Cars o1, Cars o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
