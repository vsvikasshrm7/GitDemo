import java.util.Comparator;

public class EngineComparator implements Comparator<Cars> {
    @Override
    public int compare(Cars o1, Cars o2) {

        return o1.getSize() - o2.getSize();
    }
}
