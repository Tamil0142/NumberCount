import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i)))
				c++;
			}
		System.out.println(c);
}}
