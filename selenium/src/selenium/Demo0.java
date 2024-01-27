package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo0 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\girij\\OneDrive\\Desktop\\details.Properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		
		String value=pobj.getProperty("at");
		System.out.println(value);

 }

}
