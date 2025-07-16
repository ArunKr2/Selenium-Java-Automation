package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class readproperties {

    static Properties prob = new Properties();


    public static String getValue(String Key){

        try{

            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");

            prob.load(fis);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return prob.getProperty(Key);
    }

}
