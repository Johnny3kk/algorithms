package lesson6;

import java.lang.reflect.Array;
import java.util.List;

public class Main {

    private static int getRandom() {
        double x = Math.random() * 200 - 100;
        return (int) x;
    }

    public static void main(String[] args) {
//        MyTreeMap<Integer, String> map = new MyTreeMap<>();
//
//        map.put(5,"five");
//        map.put(1,"one");
//        map.put(3,"three");
//        map.put(2,"two");
//
//        System.out.println(map);
//        System.out.println(map.get(2));
//        map.put(2,"ttt");
//        System.out.println(map);
//
//        map.deleteMin();
//        System.out.println(map);

        int n = 20;
        int deep = 6;
        int notBalanced = 0;

        for (int i = 0; i < n; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            while (map.getHeight() <= deep) {
                map.put(getRandom(), getRandom());
            }
            notBalanced = notBalanced + map.isNotBalanced();
        }
        System.out.println("не сбалансированных деревьев: " + notBalanced * 100 / n + "%");

    }
}
