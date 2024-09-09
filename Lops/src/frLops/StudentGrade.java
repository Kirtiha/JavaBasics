package frLops;

import java.util.Scanner;

public class StudentGrade {
	
	public static void main(String[]args) {
	
	Scanner obj=new Scanner(System.in);
	System.out.println("enter your marks");
	int n=obj.nextInt();
			
			if(n>=100 && n>=90) {
				System.out.println("O grade");
			}
			else if(n<=89 && n>=80){
				System.out.println("A grade");
			}
			else if(n<=79 && n>=70){
				System.out.println("B grade");
			}
			else if(n<=69 && n>=60){
				System.out.println("C grade");
			}
			else if(n<=59 && n>=50){
				System.out.println("D grade");
			}
			else if(n<=49 && n>=40){
				System.out.println("E grade");
			}
			else if(n<40){
				System.out.println("Study Harder");
			}
	

}

}
