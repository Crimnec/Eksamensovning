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
                Boolean needsReplacement = Boolean.parseBoolean(input.nextLine());
                BallType ballType = BallType.valueOf(input.nextLine());
                Boolean needsAir = Boolean.parseBoolean(input.nextLine());
                equipment.add(new Ball(equipmentType, id, locker, needsReplacement, ballType, needsAir));
            } else {
                EquipmentType equipmentType = EquipmentType.TableTennisRacket;
                int id = Integer.parseInt(input.nextLine());
                String locker = input.nextLine();
                Boolean needsReplacement = Boolean.parseBoolean(input.nextLine());
                Boolean needsNewPad = Boolean.parseBoolean(input.nextLine());
                equipment.add(new TableTennisRacket(equipmentType, id, locker, needsReplacement, needsNewPad));
            }
        }
        input.close();
    }

    public void returnEquipment() throws FileNotFoundException {
        ArrayList<Equipment> equipment = new ArrayList<>();
        File file = new File("equipment.txt");
        readFile(equipment, file);
        for (Equipment e : equipment) {
            e.printState();
        }
    }
}
