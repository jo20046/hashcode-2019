import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("a_example.in"))));
        PrintWriter printWriter = new PrintWriter("a_submit.txt", "UTF-8");

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();

        scanner.close();

        // Algorithm here







        printWriter.println("A = " + A);
        printWriter.println("B = " + B);
        printWriter.println("C = " + C);
        printWriter.println("D = " + D);
        printWriter.println("E = " + E);
        printWriter.println("F = " + F);

        printWriter.close();

    }


}
