import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipment> equipmentList = new ArrayList<>();
        File equipmentFile = new File("equipment.txt");
        FileReader f = new FileReader();
        try {
            f.returnEquipment(equipmentList, equipmentFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Program p = new Program();
        p.program(equipmentList);
    }
}
