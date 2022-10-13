package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCount;

    @Override
    public BodyPart attack() {
        hitCount = hitCount + 1;
        return whatHitCount(null, hitCount);
    }

    @Override
    public BodyPart defense() {
        hitCount = hitCount + 2;
        return whatHitCount(null, hitCount);
    }

    protected BodyPart whatHitCount(BodyPart bodyPart, int hitCount) {
        if (hitCount == 1) {
            bodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            bodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            bodyPart = BodyPart.LEG;
        } else{
            hitCount = 0;
            bodyPart = BodyPart.CHEST;
        }
        return bodyPart;
    }
}