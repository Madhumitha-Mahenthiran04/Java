import java.util.LinkedList;

public class LinkedListSample{
public static void main(String[] args) {
LinkedList<String> list = new LinkedList<>();

list.add("A");
list.add("B");
list.add("C");
list.add("B");

System.out.println("List: " + list);
list.remove("C");
System.out.println("After remove: " + list);

System.out.println("Get at 1: " + list.get(1));
list.set(1, "Z");
System.out.println("After set: " + list);
System.out.println("Contains B? " + list.contains("B"));
System.out.println("Index of B: " + list.indexOf("B"));
System.out.println("Last index of B: " + list.lastIndexOf("B"));

list.clear();
System.out.println("After clear: " + list);
}
}