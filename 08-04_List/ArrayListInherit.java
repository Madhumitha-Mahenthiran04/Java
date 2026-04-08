import java.util.*;

class Parent {
void show() {
System.out.println("Parent method");
}
}

class ArrayListInherit extends Parent {
public static void main(String[] args) {

ArrayListInherit obj = new ArrayListInherit();
obj.show();

ArrayList<String> list = new ArrayList<>();
list.add("Hello");

System.out.println(list);
}
}