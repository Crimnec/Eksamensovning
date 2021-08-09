public class Ball extends Equipment {
    private BallType ballType;
    private boolean needsAir;

    public Ball(EquipmentType equipmentType, int id, String locker, boolean needsReplacement, BallType ballType, boolean needsAir) {
        super(equipmentType, id, locker, needsReplacement);
        this.ballType = ballType;
        this.needsAir = needsAir;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }

    public boolean getNeedsAir() {
        return needsAir;
    }

    public void setNeedsAir(boolean needsAir) {
        this.needsAir = needsAir;
    }

    @Override
    public String toString() {
        return "Type: " + equipmentType + '\n' +
                "id: " + id + '\n' +
                locker + '\n' +
                "Needs replacement: " + needsReplacement + '\n' +
                "Balltype: " + ballType + '\n' +
                "Needs air: " + needsAir + '\n';
    }
}
