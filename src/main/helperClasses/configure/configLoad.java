package configure;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class configLoad {
	public static Properties prop = new Properties();
	public static Properties repository_Prop = new Properties();
	 public static void main(String[] args) throws IOException {
	
	 loadProperties();
	 prop.get("screenShot_Path");
	 System.out.println("Load"+prop.get("screenShot_Path").toString()+"End");
	 }

	public static void loadProperties() throws IOException {
		String dir = System.getProperty("user.dir") + "\\src\\main\\resources\\config_files\\config.properties";
		System.out.println(dir);
		File config_File = new File(dir);
		FileInputStream FI = new FileInputStream(config_File);
		prop.load(FI);
	} 	
	
	public static void load_repo_Properties() throws IOException {
		String dir = System.getProperty("user.dir") + "/src/main/resources/repository/homepage.properties";
		System.out.println(dir);
		File config_File = new File(dir);
		FileInputStream FI = new FileInputStream(config_File);
		repository_Prop.load(FI);
	}
	

}
