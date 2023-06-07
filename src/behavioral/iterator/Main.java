package behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("James", "Spock", "Scott", "McCoy");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        List<Integer> numbers = List.of(20, 30, 40);
        Iterator<Integer> iteratorNr = numbers.iterator();
        while (iteratorNr.hasNext()) {
            Integer next = iteratorNr.next();
            System.out.println(next);
        }

    }

}
