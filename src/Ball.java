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

    public boolean getNeedsAir() {
        return needsAir;
    }
}
