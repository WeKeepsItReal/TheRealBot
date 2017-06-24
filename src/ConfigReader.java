import com.sun.java.swing.plaf.windows.TMSchema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by jarvis on 6/23/2017.
 */
public class ConfigReader {
    private Properties properties;

    public ConfigReader(String location) {
        properties = new Properties();
        try {
            FileInputStream in = new FileInputStream(location);
            properties.load(in);
            in.close();
        } catch(Exception e){
            e.printStackTrace();
        }

    }

    public String getUsername() {

        return "YourUsername";
    }
}
