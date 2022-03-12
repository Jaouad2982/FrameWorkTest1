package utilsBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass extends Constants {
	
	public static Properties prop;
	public static FileInputStream fileInput;
	
	
	public FileInputStream fileReturn() {
		try {
			fileInput = new FileInputStream(new Constants().returnPath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return fileInput;
	}
	
	public Properties returnProp() {
		prop = new Properties();
		try {
			prop.load(fileReturn());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	public String retrunpropVal() {
		return prop.getProperty("browser");
	}
}
