package hello;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class HelloWorldUnitTest {

   
 @Test
        public void isHelloWorldTest() {
            assertEquals("HelloWorld!", HelloWorld.getText());
        }
    



    }