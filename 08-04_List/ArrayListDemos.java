import java.util.*;

class ArrayListDemos {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

ArrayList<Integer> list = new ArrayList<>();

System.out.println("Enter 5 numbers:");
for(int i = 0; i < 5; i++) {
int num = sc.nextInt();
list.add(num);
}

System.out.println("List: " + list);
System.out.println("Element at index 2: " + list.get(2));

list.set(1, 100);
System.out.println("After update: " + list);

list.remove(3);
System.out.println("After remove: " + list);

System.out.println("Size: " + list.size());

System.out.println("Contains 100? " + list.contains(100));

System.out.println("Elements:");
for(int val : list) {
System.out.println(val);
}

System.out.println("Is empty? " + list.isEmpty());

list.clear();
System.out.println("After clear: " + list);

sc.close();
}
}