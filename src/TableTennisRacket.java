public class TableTennisRacket extends Equipment {
    private boolean needsNewPad;

    public TableTennisRacket(EquipmentType equipmentType, int id, String locker, boolean needsReplacement, boolean needsNewPad) {
        super(equipmentType, id, locker, needsReplacement);
        this.needsNewPad = needsNewPad;
    }

    public boolean getNeedsNewPad() {
        return needsNewPad;
    }

    public void setNeedsNewPad(boolean needsNewPad) {
        this.needsNewPad = needsNewPad;
    }

    @Override
    public String toString() {
        return "Type: " + equipmentType + '\n' +
                "id: " + id + '\n' +
                locker + '\n' +
                "Needs replacement: " + needsReplacement + '\n' +
                "Needs new pad: " + needsNewPad + '\n';
    }
}