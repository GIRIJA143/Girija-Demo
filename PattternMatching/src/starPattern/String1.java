package starPattern;

public class String1 {

	public static void main(String[] args) {
		String s1="mom";
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
       System.out.println(reverse);
       if(reverse.equals(s1))
       {
    	   System.out.println(s1+" is Pallendrome");
       }
    	   else
    	   {
    		   System.out.println(s1+" is not a Pallendrome");
    	   }
       }
	}


