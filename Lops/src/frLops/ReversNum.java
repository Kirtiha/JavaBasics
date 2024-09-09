package frLops;

public class ReversNum {
	public static void main(String[]args) {
		String original="7557";
		String reverse="";
		int length=original.length();
		
		for (int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		{
		System.out.println(reverse);
		}
		if(original.equals(reverse))
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
