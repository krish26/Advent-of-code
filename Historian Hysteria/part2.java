import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass2 {
    public static void main(String args[]) {
        int counter=0;
        int total=0;
        int similarity=0;

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

        for (int i = 0; i < List1.size(); i++) {
            for (int j = 0; j < List2.size(); j++) {
                if (List1.get(i).equals(List2.get(j))) {
                    counter++;
                }
            }
            similarity += List1.get(i) * counter;
            counter=0;
        }
        System.out.print("Answer :" + similarity);
    }

}
