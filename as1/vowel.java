package as1;

import java.util.*;
import java.lang.Character;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char al;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character :");
		al=s.next().charAt(0);
		al=Character.toLowerCase( al);
		if(al=='a'||al=='e'||al=='i'||al=='o'||al=='u')
		{
			System.out.println("The entered character is vowel");
		}
		else
			System.out.println("The entered character is  NOT vowel");
		s.close();
	}

}
