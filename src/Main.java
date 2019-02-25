import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("a_example.in")));
        PrintWriter printWriter = new PrintWriter("a_submit.txt", "UTF-8");

        List<String> list = new ArrayList<>();
        String s;

        for (; (s = bufferedReader.readLine()) != null; ){
            list.add(s);
        }
        bufferedReader.close();

        // Algorithm here










        for (int i = 0; i < list.size(); i++) {
            printWriter.println(list.get(i));
            System.out.println(list.get(i));
        }
        printWriter.close();

    }


}
