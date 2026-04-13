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

public class CalculatorwithHistory {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
ArrayList<String> history = new ArrayList<>();

int operation;
String again = "y";

Divide obj = new Divide();

do {
System.out.println("\nOur Calculator operations:");
System.out.println("1- Addition");
System.out.println("2- Subtraction");
System.out.println("3- Multiplication");
System.out.println("4- Division");

System.out.print("Enter operation no: ");
operation = sc.nextInt();

if (operation < 1 || operation > 4) {
System.out.println("❌ Oops! select from menu");
continue;
}

System.out.print("1st no: ");
int a = sc.nextInt();

System.out.print("2nd no: ");
int b = sc.nextInt();

int result = 0;
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
}

System.out.println("✅ Result: " + result);
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

System.out.println("\n📌 yours History:");
for (String h : history) {
System.out.println(h);
}

System.out.println("🙏 Bye bye tata ");
}
}