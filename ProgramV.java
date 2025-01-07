public class ProgramV {

	public static void main(String[] args) {
		int n= 15;
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(i==j && i<=n/2 || j==n-i-1 && i<n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
