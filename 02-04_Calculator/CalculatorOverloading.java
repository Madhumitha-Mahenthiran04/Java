import java.util.Scanner;

class Addition {
public int addition(int inputa, int inputb) 
{ 
return inputa + inputb; 
}
public double addition(double inputa, double inputb) 
{
 return inputa + inputb;
 }

}

class Subtraction extends Addition {
public int subtraction(int inputa, int inputb)
 {
 return inputa - inputb;
 }
public double subtraction(double inputa, double inputb) 
{ 
return inputa - inputb; 
}
}


class Multiplication extends Subtraction {
public int multiplication(int inputa, int inputb)
 { 
return inputa * inputb; 
}
public double multiplication(double inputa, double inputb) 
{ 
return inputa * inputb; 
}
}


class Division extends Multiplication {
public int division(int inputa, int inputb) 
{
if (inputb == 0) 
{
System.out.println("Invalid Cannot divide by zero");
return 0;
}
return inputa / inputb;
}

public double division(double inputa, double inputb) 
{
if (inputb == 0) {
System.out.println("Invalid Cannot divide by zero");
return 0;
}
return inputa / inputb;
}
}


public class CalculatorOverloading
 {
public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);
int operation;
String again = "y";


do
 {
System.out.println("\nOur Calculator operations:");
System.out.println("1- Addition");
System.out.println("2- Subtraction");
System.out.println("3- Multiplication");
System.out.println("4- Division");

System.out.print("Enterr needed operation no: ");
operation = sc.nextInt();

if (operation < 1 || operation > 4) 
{
System.out.println("❌Oops! select from menu");
continue;
}

System.out.print("1st no: ");
int inputa = sc.nextInt();

System.out.print("2nd no: ");
int inputb = sc.nextInt();

int result = 0;

Division obj = new Division();

switch (operation)
 {
case 1:
result = obj.addition(inputa, inputb);
break;

case 2:
result = obj.subtraction(inputa, inputb);
break;

case 3:
result = obj.multiplication(inputa, inputb);
break;

case 4:
result = obj.division(inputa, inputb);
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