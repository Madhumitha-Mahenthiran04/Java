import java.util.Scanner;
public class CalculatorExpression{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.print("Enter expression (space separated, e.g., 5 + 3 * 2): ");
String input=sc.nextLine();

String[] tokens=input.split(" ");//str splits as sepertaedd
int result=Integer.parseInt(tokens[0]);

for(int i=1;i<tokens.length;i+=2)
{
String op=tokens[i];
int num=Integer.parseInt(tokens[i+1]);

if (op.equals("+")) result += num;
else if (op.equals("-")) result -= num;
else if (op.equals("*")) result *= num;
else if (op.equals("/")) result /= num;
}
System.out.println("Result: " + result);


}
}