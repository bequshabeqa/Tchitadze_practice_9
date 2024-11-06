import java.util.ArrayList;
import java.util.Iterator;

public class InteratingOverClass {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");


        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }


        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("\nUsing forEach with lambda expression:");
        fruits.forEach(fruit -> System.out.println(fruit));


        System.out.println("\nUsing forEach with method reference:");
        fruits.forEach(System.out::println);
    }
}
