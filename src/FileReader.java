import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public void readFile(ArrayList<Equipment> equipment, File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while(input.hasNextLine()){
            if (input.nextLine().equals("Ball")) {
                EquipmentType equipmentType = EquipmentType.Ball;
                int id = Integer.parseInt(input.nextLine());
                String locker = input.nextLine();
                boolean needsReplacement = Boolean.parseBoolean(input.nextLine());
                BallType ballType = BallType.valueOf(input.nextLine());
                boolean needsAir = Boolean.parseBoolean(input.nextLine());
                equipment.add(new Ball(equipmentType, id, locker, needsReplacement, ballType, needsAir));
            } else {
                EquipmentType equipmentType = EquipmentType.TableTennisRacket;
                int id = Integer.parseInt(input.nextLine());
                String locker = input.nextLine();
                boolean needsReplacement = Boolean.parseBoolean(input.nextLine());
                boolean needsNewPad = Boolean.parseBoolean(input.nextLine());
                equipment.add(new TableTennisRacket(equipmentType, id, locker, needsReplacement, needsNewPad));
            }
        }
        input.close();
    }

    public void returnEquipment(ArrayList<Equipment> arrayList, File file) throws FileNotFoundException {
        System.out.println("""
                ===============
                 All Equipment
                ===============""");
        readFile(arrayList, file);
        for (Equipment e : arrayList) {
            System.out.println(e.toString());
        }
    }
}
