package utils;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableEntry;

public class MyNetworkTable {
    NetworkTable table;

    public MyNetworkTable() {
            NetworkTableInstance inst = NetworkTableInstance.getDefault();
            table = inst.getTable("hellowworld");
    }

    public void writeString(String entry, String value) {
            NetworkTableEntry myEntry;
            myEntry = table.getEntry(entry);
            myEntry.setString(value);
    }

    public String readString(String entry) {
        return (table.getEntry(entry)).getString("not found");

    }
}