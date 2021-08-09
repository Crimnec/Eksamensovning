import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileReader f = new FileReader();
        try {
            f.returnEquipment();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Program p = new Program();
        p.program();
    }
}
