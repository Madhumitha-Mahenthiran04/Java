import java.util.LinkedList;
import java.util.Deque;

class LinkedListDeQuee {
public static void main(String[] args){
Deque<String> animals = new LinkedList<>();

animals.add("Cow");
System.out.println("LinkedList: " + animals);

animals.addFirst("Dog");
System.out.println(" after addFirst(): " + animals);

animals.addLast("Zebra");
System.out.println(" after addLast(): " + animals);

animals.removeFirst();
System.out.println(" after removeFirst(): " + animals);

animals.removeLast();
System.out.println(" after removeLast(): " + animals);
}
}