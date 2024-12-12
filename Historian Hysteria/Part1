import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        int total=0;

        List<Integer> List1 = new ArrayList<>();
        List<Integer> List2 = new ArrayList<>();

        try {
            File myObj = new File("C:/Users/agasy/OneDrive/Desktop/data.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.trim().isEmpty()) {
                    break;
                }

                String[] parts = line.split("\\s+");

                    List1.add(Integer.parseInt(parts[0]));
                    List2.add(Integer.parseInt(parts[1]));
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        Collections.sort(List1);
        Collections.sort(List2);

        for (int i = 0; i < List1.size(); i++) {
            int distance = Math.abs(List1.get(i) - List2.get(i));
            total += distance;
        }
        System.out.print("Answer :" + total);

    }
}
