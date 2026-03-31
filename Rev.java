import java.util.Scanner;

class RevString {
String reverse(String s) {
String rev = "";
for (int i = s.length() - 1; i >= 0; i--) {
rev += s.charAt(i);
}
return rev;
}
}


class Palindrom {
boolean isPalindrome(String s) {
String rev = "";  // FIXED
for (int i = s.length() - 1; i >= 0; i--) {
rev += s.charAt(i);
}
return s.equals(rev);
}
}


class Vowel {   
 int countVowel(String s) {
int count = 0;

for (char c : s.toCharArray()) {
if ("aeiouAEIOU".indexOf(c) != -1) {
count++;
}
}
return count;   
}
}


class Words{
int countWords(String s){
s=s.trim();
String[] w=s.split(" ");
int a=w.length;
return a;
}
}











public class Rev {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
 System.out.println("Enter String:");
String input = sc.nextLine();  

System.out.println("operation:");
System.out.println("1 - reverse");
System.out.println(" 2- Plaindrom");
System.out.println("3 - count vowel");
System.out.println("4 - count words");

int operation=sc.nextInt();

 RevString r = new RevString();
 Palindrom p = new Palindrom();
 Vowel v = new Vowel();  
Words w=new Words(); 

switch(operation){
case 1:
System.out.println("Reversed output: "+r.reverse(input));
break;

case 2:
System.out.println("Palindrom output:"+p.isPalindrome(input));
break;

case 3:
System.out.println("Vowel output:"+v.countVowel(input));
break;

case 4:
System.out.println("Wrods count:"+w.countWords(input));
break;

default:
System.out.println("Invalid operation");
}
    }
}