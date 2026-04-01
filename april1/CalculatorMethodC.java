import java.util.Scanner;


class Addition{
public int addition(int a, int b){
return a+b;
}
}

class Subtract{
public int subtract(int a, int b){
return a-b;
}
}

class Multiply{
public int multiply(int a, int b){
return a*b;
}
}

class Divide{
public int divide(int a, int b){
if(a==0 || b==0){
System.out.println("invalid nos");
return 0;
}

return a/b;
}
}


public class CalculatorMethodC{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

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
Addition add=new Addition();
result=add.addition(no1, no2);
break;

case 2:
Subtract sub=new Subtract();
result=sub.subtract(no1,no2);
break;

case 3:
Multiply mul= new Multiply();
result=mul.multiply(no1,no2);
break;

case 4:
Divide div=new Divide();
result=div.divide(no1, no2);
break;

default:
System.out.println("Sooory its not in our operations menu ");
continue;

}
System.out.println("The result"+result);

System.out.print("other calculation  ");
again=sc.next();
}while(again.equals("yes")|| again.equals("YES"));
System.out.println("bye bye");

}
}