package frLops;

public class DiamondPattern {
	
	public static void main(String[]args){
		
		int row=5;
		for (int i=0;i<row;i++) {
			for(int j=row-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	
	
	
		int line=5;
		for (int i=0;i<line;i++) {
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=line-i;j>1;j--){
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
