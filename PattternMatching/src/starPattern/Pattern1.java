package starPattern;

public class Pattern1 {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	for(int a=5;a>=1;a--)
	{
		for(int b=1;b<=a;b++)
		{
			System.out.print(b);
		}
		System.out.println();
	}
}
}
