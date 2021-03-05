package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

	public static void main(String[] args) {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("./config/browserconfig.properties");
			prop.load(input);
			System.out.println(prop.getProperty("chrome"));
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
