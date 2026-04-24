import java.util.Scanner;

public class ExpressionCalculatorNoSpace 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter expression (e.g., 5+3*2): ");

String expr = sc.nextLine();
int result = 0;
int currentNumber = 0;
char lastOperator = '+';

for (int i = 0; i < expr.length(); i++) 
{
char ch = expr.charAt(i);

if (Character.isDigit(ch))
{
currentNumber = currentNumber * 10 + (ch - '0');
}

if (!Character.isDigit(ch) || i == expr.length() - 1)
{
switch (lastOperator) 
{
case '+':
result += currentNumber;
break;
case '-':
result -= currentNumber;
break;
case '*':
result *= currentNumber;
break;
case '/':
result /= currentNumber;
break;
}
lastOperator = ch;
currentNumber = 0;
}
}
System.out.println("Result: " + result);
}
}