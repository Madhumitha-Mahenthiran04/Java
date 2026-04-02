import java.util.Scanner;

class Add {
public int addition(int inputa, int inputb) {
return inputa + inputb;
}
}

class Subtract extends Add {
public int subtract(int inputa, int inputb) {
return inputa - inputb;
}
}

class Multiply extends Add {
public int multiply(int inputa, int inputb) {
return inputa * inputb;
}
}

class Divide extends Add {
public int divide(int inputa, int inputb) {
if (inputb == 0) {
System.out.println("Invalid Cannot divide by zero");
return 0;
}
return inputa / inputb;
}
}

public class CalculatorHeirachiInherit {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int operation;
String again = "y";

do {
System.out.println("\nOur Calculator operations:");

System.out.println("1- Addition");
System.out.println("2- Subtraction");
System.out.println("3- Multiplication");
System.out.println("4- Division");

System.out.print("Enterr needed operation no: ");
operation = sc.nextInt();

if(operation < 1 || operation > 4) {
System.out.println("❌Oops! select from menu");
continue;
}

System.out.print("1st no: ");
int inputa = sc.nextInt();

System.out.print("2nd no: ");
int inputb = sc.nextInt();
Multiply mul = new Multiply(); //for herichi concept- to cal parent via child

int result = 0;

switch (operation) {

case 1:
//Add add = new Add(); 
result = mul.addition(inputa, inputb);
break;

case 2:
Subtract sub = new Subtract();
result = sub.subtract(inputa, inputb);
break;

case 3:
result = mul.multiply(inputa, inputb);
break;

case 4:
Divide div = new Divide();
result = div.divide(inputa, inputb);
break;

default:
System.out.println("Sorry, invalid choice");
continue;
}

System.out.println("The result: " + result);

System.out.print("Other calculation (y/n): ");
again = sc.next();

} while (again.toUpperCase().equals("Y"));

System.out.println("Bye bye");
}
}