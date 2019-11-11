package hello;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldUnitTest {
    public static String getText(){
        return "HelloWorld!";
    }
 
    public static void main(String[] args) {
        System.out.println(getText());
    }
 
    @Test
    public void isHelloWorldTest() {
        assertEquals("HelloWorld!", HelloWorld.getText());
    }

}
