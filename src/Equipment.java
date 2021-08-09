public class Equipment {
    private EquipmentType equipmentType;
    private int id;
    private String locker;
    private boolean needsReplacement;

    public Equipment(EquipmentType equipmentType, int id, String locker, boolean needsReplacement) {
        this.equipmentType = equipmentType;
        this.id = id;
        this.locker = locker;
        this.needsReplacement = needsReplacement;
    }

    public void printState() {
        System.out.println( "Type: " + equipmentType.toString() + '\n' +
                            "Id: " + id + '\n' +
                            locker + '\n' +
                            "Needs replacement: " + needsReplacement );
                            if (equipmentType.equals(EquipmentType.Ball)) {
                                System.out.println( Ball.getBallType() + '\n' +
                                                    "Ball.getNeedsAir()" + '\n'
                                );
                            } else {
                                System.out.println( "TableTennisRacket.needsNewPad()" + '\n'
                                );
                            }
    }
}
