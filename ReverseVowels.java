import java.util.Scanner;
class ReverseVowels{
public static String reverseVowels(String s){
char[] arr=s.toCharArray();
int i=0, j=arr.length;
while(i<j)
{
if(isVowels(arr[i])&&isVowel(arr[j]))
{
char temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;
}
else if(isVowel(arr[i]))
{
j--;
}
else{
i++;
}
}
return new String(arr);
}
private static boolean isVowel(char c){
return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
}
public static void main(String args[]){
Scanner sc=new Scanner(Sytsem.in);
String input=sc.nextLine();
String output=reverseVowels(input);
System.out.println(output);
}
}
