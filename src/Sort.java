import java.util.ArrayList;

public class Sort {
    public void printBallsNeedingMoreAir(ArrayList<Equipment> arrayList) {
        System.out.println("""
                =================
                 Needs more air:
                =================""");
        for (Equipment e : arrayList) {
            if (e.equipmentType.equals(EquipmentType.Ball) && ((Ball) e).getNeedsAir()) {
                System.out.println(e);
            }
        }
    }

    public void printEquipmentNeedingToBeReplaced(ArrayList<Equipment> arrayList) {
        System.out.println("""
                ===================
                 Needs replacement
                ===================""");
        for (Equipment e : arrayList) {
            if (e.needsReplacement) {
                System.out.println(e);
            }
        }
    }

    public void printTableTennisRacketsNeedingNewPad(ArrayList<Equipment> arrayList) {
        System.out.println("""
                ===============
                 Needs new pad
                ===============""");
        for (Equipment e : arrayList) {
            if (e.equipmentType.equals(EquipmentType.TableTennisRacket) && ((TableTennisRacket) e).getNeedsNewPad()) {
                System.out.println(e);
            }
        }
    }
}
