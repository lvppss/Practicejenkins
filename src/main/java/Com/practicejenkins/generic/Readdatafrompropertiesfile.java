package Com.practicejenkins.generic;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readdatafrompropertiesfile {
public String readdatafrompropfile(String key) throws IOException
{
	FileInputStream fis=new FileInputStream(IAutoConstants.propfilepath);
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty(key);
	return value;
	
	
	
}


}
