package simpleJava;

public class SimplePrint {

	public static void main(String[] args) {
		int n=5;
		

		for(int i=1;i<=n;i++)
		{   System.out.print("\n");
			for(int k=n-i;k>=1;k--)
			{	
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
		for(int i=1;i<=n-1;i++)
		{   System.out.print("\n");
			for(int k=1;k<=i;k++)
			{	
				System.out.print(" ");
			}
			
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("* ");
			}
		
		}

	}

}
