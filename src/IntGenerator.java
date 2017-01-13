import java.util.*;

/**
 * Created by Andy on 1/12/2017.
 */
public class IntGenerator {

    public static void main(String[] args) {


        Set<Integer> unsortedNoRepeat = new LinkedHashSet<Integer>();
        Random r = new Random(System.currentTimeMillis());

        while (unsortedNoRepeat.size() < 1000000){
            unsortedNoRepeat.add(r.nextInt(10000000));
        }

        ArrayList<Integer> unsorted = new ArrayList<Integer>(unsortedNoRepeat);
        BitmapSort bt = new BitmapSort(unsorted);
        ArrayList<Integer> sorted = bt.sort();
        System.out.println(sorted.toString());
    }
}
