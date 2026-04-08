import java.util.*;

abstract class Animal {
abstract void sound();
}

class Dog extends Animal {
void sound() {
System.out.println("Bark");
}
}

class ArrayListAbstract{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Animal obj = new Dog();
obj.sound();

ArrayList<Integer> list = new ArrayList<>();

System.out.println("Enter 5 numbers:");
for(int i = 0; i < 5; i++)
 {
int num = sc.nextInt();
list.add(num);
}

System.out.println(list);
}
}