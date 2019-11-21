package utils;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableEntry;
public class MyNetworkTable {
    NetworkTable table, table2;
    // this is the "constructor" for the class
    // it is executed each time a new instance of the class is created
    public MyNetworkTable() {
        NetworkTableInstance inst = NetworkTableInstance.getDefault();
        inst.startClient("localhost");
        table = inst.getTable("helloworld");
        table2 = inst.getTable("Learning");
        table2.getEntry("IDK").setString("123");
    }
    public void writeString(String entry, String value){
            NetworkTableEntry myEntry;
    myEntry = table.getEntry(entry);
    myEntry.setString(value);
    }
    public String readString(String entry) {
        // the getstring method takes a default string as a parameter
        // the default string will be returned if the entry is not found 
        // in the table
        return (table.getEntry(entry)).getString("not found");
    }
}