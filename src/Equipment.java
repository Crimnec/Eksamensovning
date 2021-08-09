public abstract class Equipment {
    public EquipmentType equipmentType;
    public int id;
    public String locker;
    public boolean needsReplacement;

    public Equipment(EquipmentType equipmentType, int id, String locker, boolean needsReplacement) {
        this.equipmentType = equipmentType;
        this.id = id;
        this.locker = locker;
        this.needsReplacement = needsReplacement;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocker() {
        return locker;
    }

    public void setLocker(String locker) {
        this.locker = locker;
    }

    public boolean getNeedsReplacement() {
        return needsReplacement;
    }

    public void setNeedsReplacement(boolean needsReplacement) {
        this.needsReplacement = needsReplacement;
    }

}
