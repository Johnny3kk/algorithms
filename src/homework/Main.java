package homework;

import java.util.Scanner;

public class Main {
    static final long[] st = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192,
            16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152 };

    public static void main(String[] args) {
        // Задача о рюкзаке
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long bagpackCapacity = in.nextLong();

        Item[] arrOfItems = new Item[n];

        for (int i = 0; i < n; i++) {
            long w = in.nextLong();
            long p = in.nextLong();
            arrOfItems[i] = new Item(p, w);
        }

        //переборное решение.
        // всего вариантов 2^n
        long varCount = (long) Math.pow(2, n);
        long len = Long.toBinaryString(varCount - 1).length();
        long maxPrice = 0;
        long optimal = 0;

        for (int i = 0; i < varCount; i++) {
            long weight = 0;
            long price = 0;
            for (int j = 0; j < len; j++) {
                if (weight <= bagpackCapacity && (i & st[j]) > 0) {
                    weight += arrOfItems[j].weight;
                    price += arrOfItems[j].price;
                }
            }

            if (weight <= bagpackCapacity && price > maxPrice) {
                maxPrice = price;
                optimal = i;
            }

            if (weight <= bagpackCapacity && price == maxPrice && Long.bitCount(optimal) > Long.bitCount(i)) {
                optimal = i;
            }
        }

        System.out.println(Long.bitCount(optimal) + " " + maxPrice);
        for (int j = 0; j < len; j++) {
            if ((optimal & st[j]) > 0) {
                System.out.print(j + 1 + " ");
            }
        }
    }

    static class Item {
        long price;
        long weight;

        public Item(long price, long weight) {
            this.price = price;
            this.weight = weight;
        }
    }
}
