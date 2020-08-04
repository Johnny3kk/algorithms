package lesson5;

import java.util.ArrayList;

public class BackpackSort {

    private int maxW;
    private ArrayList arr;

    public BackpackSort(int maxW, ArrayList arr) {
        this.maxW = maxW;
        this.arr = arr;

        System.out.println(arr);
    }

    public int sortIt() {
        int n = arr.size();
        return sortIt(arr, maxW, n);
    }
    private int sortIt(ArrayList arr, int maxW, int n) {

        if (n <= 0 || maxW <= 0) return 0;

        Stuff stuff = (Stuff) arr.get(n - 1);

        if ( stuff.getWeight() > maxW) return sortIt(arr, maxW, n - 1);

        else return Math.max(stuff.getPrice() + sortIt(arr, maxW - stuff.getWeight(), n - 1),
                sortIt(arr, maxW, n - 1));
    }

}
