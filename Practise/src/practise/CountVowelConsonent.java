package practise;

public class CountVowelConsonent {
public static void main(String[] args) {
	String sentence="Number of vowels and consonents";
	int vowel=0,consonent=0;
 int len=sentence.length();
 for(int i=0;i<len;i++)
 {
	 char ch=sentence.charAt(i);
	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		 vowel++;
	 else
		 consonent++;
 }
 System.out.println("No of vowels: "+vowel);
 System.out.println("No of consonents: "+consonent);
}
}
