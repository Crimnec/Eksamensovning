public class TableTennisRacket extends Equipment {
    private boolean needsNewPad;

    public TableTennisRacket(EquipmentType equipmentType, int id, String locker, boolean needsReplacement, boolean needsNewPad) {
        super(equipmentType, id, locker, needsReplacement);
        this.needsNewPad = needsNewPad;
    }
}