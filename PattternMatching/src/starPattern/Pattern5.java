package starPattern;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(96+i));
			}
			System.out.println();
		}
		for(char i='a';i<='e';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
}
}