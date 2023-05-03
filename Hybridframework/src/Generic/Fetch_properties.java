package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetch_properties {

	public static String get_properties() throws IOException
	{
		FileInputStream file= new FileInputStream("/Hybridframework/src/utils/P.properties");
		Properties pro = new Properties();
		pro.load(file);
		String a1=pro.getProperty("baseurl");
		return a1;
		

	}

}
