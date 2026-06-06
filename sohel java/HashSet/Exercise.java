package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("lynx");
        fruits.add("banana");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();

            if (fruit.matches(".*[AEIOUaeiou].*")) {
                iterator.remove();
            }

        }
        System.out.println(fruits);

    }

}
