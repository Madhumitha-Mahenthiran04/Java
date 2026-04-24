import java.util.Scanner;
import java.util.ArrayList;

class Add {
public int addition(int a, int b) {
return a + b;
}
}

class Subtract extends Add {
public int subtract(int a, int b) {
return a - b;
}
}

class Multiply extends Subtract {
public int multiply(int a, int b) {
return a * b;
}
}

class Divide extends Multiply {
public int divide(int a, int b) {
if (b == 0) {
System.out.println("❌ Cannot divide by zero");
return 0;
}
return a / b;
}
}

class Advanced extends Divide {
public int modulus(int a, int b) {
return a % b;
}

public double power(int a, int b) {
return Math.pow(a, b);
}

public double squareroot(int a) {
if (a < 0) {
System.out.println("❌ Negative number");
return 0;
}
return Math.sqrt(a);
}

public int square(int a) {
return a * a;
}

public int cube(int a) {
return a * a * a;
}

public int absolute(int a) {
return Math.abs(a);
}
}

public class CalculatorwithHistory {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
ArrayList<String> history = new ArrayList<>();

int operation;
String again = "y";

Advanced obj = new Advanced();

do {
System.out.println("\nOur Calculator operations:");
System.out.println("1- Addition");
System.out.println("2- Subtraction");
System.out.println("3- Multiplication");
System.out.println("4- Division");
System.out.println("5- Modulus");
System.out.println("6- Power");
System.out.println("7- Square Root");
System.out.println("8- Square");
System.out.println("9- Cube");
System.out.println("10- Absolute");


System.out.print("Enter operation no: ");
operation = sc.nextInt();

if (operation < 1 || operation > 10) {
System.out.println("❌ Oops! select from menu");
continue;
}

int a=0,b=0;
if(operation==7|| operation==8||operation==9||operation==10){
System.out.println("Eneter some noss");
a=sc.nextInt();
}
else{
System.out.print("1st no: ");
a = sc.nextInt();

System.out.print("2nd no: ");
b = sc.nextInt();
}

double result = 0;
String record = "";

switch (operation) {
case 1:
result = obj.addition(a, b);
record = a + " + " + b + " = " + result;
break;

case 2:
result = obj.subtract(a, b);
record = a + " - " + b + " = " + result;
break;

case 3:
result = obj.multiply(a, b);
record = a + " * " + b + " = " + result;
break;

case 4:
result = obj.divide(a, b);
record = a + " / " + b + " = " + result;
break;

case 5:
result = obj.modulus(a, b);
record = a + " % " + b + " = " + result;
break;

case 6:
result = obj.power(a, b);
record = a + " ^ " + b + " = " + result;
break;

case 7:
result = obj.squareroot(a);
record = "√" + a + " = " + result;
break;

case 8:
result = obj.square(a);
record = a + "² = " + result;
break;

case 9:
result = obj.cube(a);
record = a + "³ = " + result;
break;

case 10:
result = obj.absolute(a);
record = "|" + a + "| = " + result;
break;

}

System.out.println("hello your's result: " + result);
history.add(record);

while (true) {
System.out.println("\n1. Continue");
System.out.println("2. View History");
System.out.println("3. Exit");

String choice = sc.next();

if (choice.equals("1")) {
again = "y";
break;
} 
else if (choice.equals("2")) {
System.out.println("\n📜 History:");
for (String h : history) {
System.out.println(h);
}
} 
else if (choice.equals("3")) {
again = "n";
break;
} 
else {
System.out.println("❌ Invalid choice");
}
}

} while (again.toUpperCase().equals("Y"));

System.out.println("\n yours History:");
for (String h : history) {
System.out.println(h);
}

System.out.println("🙏 Bye bye tata ");
}
}