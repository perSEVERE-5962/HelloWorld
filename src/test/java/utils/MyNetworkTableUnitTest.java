package utils;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import edu.wpi.first.networktables.NetworkTableInstance;
import hello.HelloWorld;
public class MyNetworkTableUnitTest {
    NetworkTableInstance inst;

    @Before
    public void before() {
        inst = NetworkTableInstance.getDefault();
        inst.startServer();
    }
@After
public void after() {
    inst.stopServer();
}
@Test
public void isHelloworldTest() {
    // get an instance of our MyNetworkTable class
    MyNetworkTable myNetworkTable = new MyNetworkTable();
    // write a string to the NetworkTable
    myNetworkTable.writeString("Helloworld","String");
    myNetworkTable.writeString("Nice","String");
    // versify that the string we read from the NetworkTable
    // matches the one we passed in
    assertEquals("String", myNetworkTable.readString("Helloworld"));
    while (0==0){}
   }
}