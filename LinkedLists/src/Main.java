import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit2 = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit + "\n--------------------------");

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit + "\n--------------------------");

        printItinerary(placesToVisit);
        System.out.println("--------------------------");

        printItinerary2(placesToVisit);
        System.out.println("--------------------------");

        printItinerary3(placesToVisit);
        System.out.println("--------------------------");

        System.out.println("listIterator");
        testIterator2(placesToVisit);
        System.out.println("--------------------------");

        System.out.println("Iterator");
        testIterator(placesToVisit);
        System.out.println("--------------------------");

        gettingElements(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
//        Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
//        Stack Methods
        list.push("Alice Springs");

    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");
        System.out.println(list + "\n");

        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");
        System.out.println(list + "\n");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");
        System.out.println(list + "\n");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        System.out.println(list + "\n");

//        Queue/Deque poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");
        System.out.println(list + "\n");

        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");
        System.out.println(list + "\n");

        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list + "\n");

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed");
        System.out.println(list + "\n");

    }

    private static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));
//        Queue retrieval method
        System.out.println("Element from element() = " + list.element());
//        Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());

        System.out.println();
    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) +
                    " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown +
                    " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }
    public static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown +
                    " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    private static void testIterator(LinkedList<String> list) {

        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
//                list.remove(); //error java.util.ConcurrentModificationException
//                iterator.add("Lake Wivenhoe"); // Iterator can only remove

            }
        }
        System.out.println(list);

    }
    private static void testIterator2(LinkedList<String> list) {

        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (iterator.next().equals("Sydney")) {
////                iterator.remove();
////                list.remove(); //error java.util.ConcurrentModificationException
                iterator.add("Lake Wivenhoe");
            }
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());

    }
}