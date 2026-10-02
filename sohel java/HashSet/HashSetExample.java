package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> visitedCountries = new HashSet<>();
        visitedCountries.add("India");
        visitedCountries.add("Dubai");
        visitedCountries.add("USA");
        visitedCountries.add("Iran");
        visitedCountries.add("Canada");
        visitedCountries.add("India");
        System.out.println(visitedCountries.size());
        System.out.println(visitedCountries);
        boolean isDubai = visitedCountries.contains("Dubai");
        System.out.println(isDubai);
        boolean isRemoved = visitedCountries.remove("Canada");
        System.out.println(isRemoved);
        System.out.println(visitedCountries);

        Iterator<String> iterator = visitedCountries.iterator();
        while (iterator.hasNext()) {
            String visited = iterator.next();
            System.out.println(visited.toUpperCase());

        }
        for (String visit : visitedCountries) {
            System.out.println(visit.toLowerCase());
        }

    }

}
