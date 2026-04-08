import java.util.*;

class Vectorsample {
public static void main(String[] args) {

Vector<String> v = new Vector<>();
v.add("Apple");
v.add("Banana");
v.add("Mango");

System.out.println("Vector: " + v);
System.out.println("Element  index 1: " + v.get(1));

v.set(1, "Orange");
System.out.println("After update: " + v);

v.remove(2);
System.out.println("After remove: " + v);

System.out.println("Size: " + v.size());
System.out.println("Contains Apple? " + v.contains("Apple"));
System.out.println("Elements:");
for(String s : v) {
System.out.println(s);
}
v.clear();
System.out.println("After clear: " + v);
}
}