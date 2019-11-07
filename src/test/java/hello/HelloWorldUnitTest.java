package hello;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class HelloWorldUnitTest {
 @Test
  public void isHelloWorldTest() {
   assertEquals("HelloWorld!", HelloWorld.getText());
   }
}
