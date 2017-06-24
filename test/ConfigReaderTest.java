import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jarvis on 6/23/2017.
 */
public class ConfigReaderTest {


    @Test
    public void canMakeConfigReader() {
        ConfigReader configReader = new ConfigReader("resources/config-test.properties");
        assertNotNull(configReader);

    }

    @Test
    public void canGetUsername() {
        ConfigReader configReader = new ConfigReader("resources/config-test.properties");
        String actualUsername = configReader.getUsername();
        String expectedUsername = "YourUsername";
        assertEquals(expectedUsername,actualUsername);
    }

    @Test
    public void canGetUsernameSecondFile() {
        ConfigReader configReaderTwo = new ConfigReader("resources/config-test2.properties");
        String actualUsername = configReaderTwo.getUsername();
        String expectedUsername = "Love";
        assertEquals(expectedUsername, actualUsername);
    }
}