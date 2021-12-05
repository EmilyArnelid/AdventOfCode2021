import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] argh) throws IOException {
        ArrayList<String> numbers = ReadFile();
       // String number = numbers.get();
        int result = 0;
        for (int i = 0; i < numbers.size()-1; i = i + 1) {

            int first = Integer.parseInt(numbers.get(i));
            int second = Integer.parseInt(numbers.get(i+1));

            if (second > first) {
                result = result + 1;
            }
        }
        System.out.println(result);
    }

    public static ArrayList<String> ReadFile() throws IOException {
        FileReader file = new FileReader("inputDay1");

        BufferedReader bufferedreader = new BufferedReader(file);
        Scanner scanner = new Scanner(bufferedreader);

        ArrayList <String> numbers = new ArrayList<String>();

        while(scanner.hasNextLine()){
            numbers.add(scanner.nextLine());
        }
        bufferedreader.close();
        return numbers;
    }

}
