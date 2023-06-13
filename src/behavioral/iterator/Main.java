package behavioral.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("James", "Spock", "Scott", "McCoy");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        Iterator<Integer> iteratorNr = numbers.iterator();
        while (iteratorNr.hasNext()) {
            Integer next = iteratorNr.next();
            System.out.println(next);
        }

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);
        Iterator<Integer> iteratorNr2 = numbers2.iterator();
        while (iteratorNr2.hasNext()) {
            Integer next = iteratorNr2.next();
            System.out.println(next);
        }

    }

}
