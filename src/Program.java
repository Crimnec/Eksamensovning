import java.util.ArrayList;

public class Program {
    public void program(ArrayList<Equipment> arrayList) {
        Sort s = new Sort();
        s.printBallsNeedingMoreAir(arrayList);
        s.printEquipmentNeedingToBeReplaced(arrayList);
        s.printTableTennisRacketsNeedingNewPad(arrayList);
    }
}
