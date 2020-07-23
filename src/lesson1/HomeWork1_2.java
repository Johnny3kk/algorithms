import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork1_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        out.print(n + 1);
        out.flush();
    }

}
