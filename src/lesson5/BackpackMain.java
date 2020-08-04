package lesson5;

import java.util.ArrayList;

public class BackpackMain {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add(new Stuff(1,1));
        arr.add(new Stuff(1,2));
        arr.add(new Stuff(1,3));
        arr.add(new Stuff(1,4));
        arr.add(new Stuff(1,5));
        arr.add(new Stuff(1,6));

        BackpackSort bs = new BackpackSort(3, arr);
        System.out.println(bs.sortIt());
    }
}
