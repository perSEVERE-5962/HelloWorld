package utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

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
    public void isHelloWorldTest() {
        MyNetworkTable myNetworkTable = new MyNetworkTable();
        myNetworkTable.writeString("HelloWorld", HelloWorld.getText());
        assertEquals("HelloWorld!", myNetworkTable.readString("HelloWorld"));
    }
}