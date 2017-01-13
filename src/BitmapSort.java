/**
 * Created by Andy on 1/12/2017.
 *
 */

import java.util.*;

public class BitmapSort {

    private ArrayList<Integer> array;
    private ArrayList<Integer> sortedArray;
    private BitSet map = new BitSet();

    /**
     * Constructor for existing sets
     * @param a the set to be sorted
     */
    public BitmapSort(ArrayList<Integer> a) {
        this.array = a;
    }

    /**
     * Setter for the array to be sorted
     * @param a the array to be sorted
     */
    public void setArray(ArrayList<Integer> a) {
        this.array = a;
    }

    /**
     * Sorts the given array and returns the sorted array
     * @return a sorted array
     */
    public ArrayList<Integer> sort() {
        for (int i:array) {
            map.flip(i);
        }
        for (int j = 0; j < map.size(); j++) {
            if (map.get(j)) {
                sortedArray.add(j);
            }
        }
        return sortedArray;
    }

}
