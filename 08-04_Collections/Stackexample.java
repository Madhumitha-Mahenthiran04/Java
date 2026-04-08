import java.util.Stack;

public class Stackexample {
public static void main(String[] args) {

Stack<Integer> stack = new Stack<>();

stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);

System.out.println("Stack: " + stack);
System.out.println("Top  -peek: " + stack.peek());
System.out.println("Removed -poped: " + stack.pop());
System.out.println("stak After pop: " + stack);
System.out.println("position of 20: " + stack.search(20));
System.out.println("Is stack empty? " + stack.empty());
System.out.println("Stack size: " + stack.size());

for(Integer i : stack) {
System.out.println(i);
}
}
}