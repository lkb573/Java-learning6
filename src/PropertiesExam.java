import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExam {
    public static void main(String[] args){

        Properties prop = new Properties();

        prop.setProperty("time","30");
        prop.setProperty("lang","kr");
        prop.setProperty("size","10");
        prop.setProperty("capacity","10");

        Enumeration e = prop.propertyNames();

        while(e.hasMoreElements()){
            String ele = (String)e.nextElement();
            System.out.println(ele + " --> " + prop.getProperty(ele));
        }

        System.out.println();

        prop.setProperty("size", "20");
        System.out.println("size --> " + prop.getProperty("size"));
        System.out.println("capacity --> " + prop.getProperty("capacity","20"));
        System.out.println("loadfactor --> " + prop.getProperty("loadfactor","0.75"));

        System.out.println(prop);
        prop.list(System.out);
    }
}