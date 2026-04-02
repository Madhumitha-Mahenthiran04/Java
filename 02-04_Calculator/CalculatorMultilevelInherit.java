import java.util.Scanner;


class Add  {
public int addition(int inputa, int inputb) {
return inputa + inputb;
}
}

class Subtract extends Add {
public int subtract(int inputa, int inputb) {
return inputa - inputb;
}
}

class Multiply extends Subtract {
public int multiply(int inputa, int inputb) {
return inputa * inputb;
}
}

class Divide extends Multiply {
public int divide(int inputa, int inputb) {
if (inputb == 0) {
System.out.println("Invalid Cannot divide by zero");
return 0;
}
return inputa / inputb;
}
}

public class CalculatorMultilevelInherit{
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

//if(operation >0 && operation <=4)
if(operation < 1 || operation > 4) {
//System.out.println("select from menu");
System.out.println("❌Oops! select from menu");

continue;
}

System.out.print("1st no: ");
int inputa = sc.nextInt();

System.out.print("2nd no: ");
int inputb = sc.nextInt();

int result = 0;

Divide obj=new Divide();
//Multiply obj=new Multiply();-- add to mulitply
//Add obj = new Divide(); --error fr child cls

switch (operation) {

case 1:
result = obj.addition(inputa, inputb);
break;

case 2:
result = obj.subtract(inputa, inputb);
break;

case 3:
result = obj.multiply(inputa, inputb);
break;

case 4:
result = obj.divide(inputa, inputb);
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
