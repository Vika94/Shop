import java.util.Comparator;

public class Sort implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return o2.getId() - o1.getId();
    }
}
