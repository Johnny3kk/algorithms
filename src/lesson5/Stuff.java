package lesson5;

public class Stuff {
    private int weight;
    private int price;

    public Stuff (int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ w:" + getWeight() + "; p:" + getPrice() + " ]");
        return sb.toString();
    }

}
