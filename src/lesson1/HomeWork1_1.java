import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork1_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        out.print(k);
        out.print(9);
        out.print(9-k);
        out.flush();
    }
}
