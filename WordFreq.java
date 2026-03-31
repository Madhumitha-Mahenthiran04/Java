import java.util.Scanner;

class WordFrequency {

void countWords(String[] words) {

boolean[] visit = new boolean[words.length];
for (int i = 0; i < words.length; i++) {
if (visit[i]) continue;
int count = 1;
for (int j = i + 1; j < words.length; j++) {
if (words[i].equals(words[j])) {
count++;
visit[j] = true;
}
}
System.out.println(words[i] + " = " + count);
}
}
}

public class WordFreq {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter sentence:");
String input = sc.nextLine();
String[] words = input.split(" ");
WordFrequency wf = new WordFrequency();
wf.countWords(words);
}
}