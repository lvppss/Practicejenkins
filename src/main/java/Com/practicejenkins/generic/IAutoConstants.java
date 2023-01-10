package Com.practicejenkins.generic;

public interface IAutoConstants {
	String userdir=System.getProperty("user.dir");     //It get the directory of current working project.
String propfilepath=userdir+"./data/practicejenkins.properties";   //It shows the path of in our project in which file it is there Here we use ./ also
String excelpath=userdir+"./data/datareadinexcel.xlsx";


}
