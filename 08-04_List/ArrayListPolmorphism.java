import java.util.*;

class ArrayListPolmorphism {
public static void main(String[] args) {

List<String> list = new ArrayList<>();
list.add("A");

list = new LinkedList<>();
list.add("B");

System.out.println(list);
}
}