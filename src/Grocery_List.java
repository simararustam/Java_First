import java.util.Scanner;
import java.util.ArrayList;

public class Grocery_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> groc_List = new ArrayList<>();

        System.out.println("Add elements to list:");

        while (true) {
            String element = input.next();

            if (element.equalsIgnoreCase("ok")) break;

            groc_List.add(element);
        }

        System.out.println("--------Your List:--------");
        for (String elm : groc_List) {
            System.out.println(elm);
        }
    }
}
