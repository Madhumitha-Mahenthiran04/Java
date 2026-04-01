import java.util.Scanner;

class Calculator{

public int add(int a, int b){
return a+b;
}

public int subtract(int a, int b){
return a-b;
}

public int multiply(int a, int b){
return a*b;
}

public int divide(int a, int b){
if(a==0 || b==0){
System.out.println("invalid nos");
return 0;
}

return a/b;
}
}


public class CalculatorMethod{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
Calculator cal=new Calculator();
int operation;
String again = "yes";

do{
System.out.println("Our Calculator operations:");

System.out.println("1- Addition");
System.out.println("2- Subtraction");
System.out.println("3- Multiplication");
System.out.println("4- Division");

System.out.print("Eneter needed operation no:");
operation=sc.nextInt();

System.out.print("1st no:");
int  no1=sc.nextInt();
System.out.print("2nd no:");
int no2=sc.nextInt();

int result=0;


switch(operation){
case 1:
result=cal.add(no1, no2);
break;

case 2:
result=cal.subtract(no1,no2);
break;

case 3:
result=cal.multiply(no1,no2);
break;

case 4:
result=cal.divide(no1, no2);
break;

default:
System.out.println("Sooory its not in our operations menu ");
continue;

}
System.out.println("The result"+result);

System.out.print("other calculation");
again=sc.next();
}while(again.equals("yes")|| again.equals("YES"));

}
}