package utils;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableEntry;


public class MyNetworkTable {
    NetworkTable table;
   // this is the "constructor" for the class
   // it is executed each time a new instance of the class is created   
   public MyNetworkTable() {
    NetworkTableInstance inst = NetworkTableInstance.getDefault();
    inst.startClient ("10.99.99.2");
    table = inst.getTable("rbgled");
    NetworkTableEntry redEntry = table.getEntry("red");
    NetworkTableEntry greenEntry = table.getEntry("green");
    NetworkTableEntry blueEntry = table.getEntry("blue");
   }

   public void writeString(String entry, String value) {
    NetworkTableEntry myEntry;
    myEntry = table.getEntry(entry);
    myEntry.setString(value);
}

public String readString(String entry) {
    // the getString method takes a default string as a parameter
    // the default string will be returned if the entry is not found
    // in the table
    return (table.getEntry(entry)).getString("Not found");
}
}
