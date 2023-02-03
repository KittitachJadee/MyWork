//Pangon La-or-on
//6409700074
public class Monster {
    private final double EYE_SIGHT = 5;
    private boolean sleep;
    private int positionX;
    private int positionY;
    private double eyeSight;

    public Monster() {
        positionX = 0;
        positionY = 0;
        eyeSight = EYE_SIGHT;
        sleep = true;
    }

    public Monster(int x, int y) {
        positionX = x;
        positionY = y;
        eyeSight = EYE_SIGHT;
        sleep = true;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean status) {
        sleep = status;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int x) {
        positionX = x;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int y) {
        positionY = y;
    }

    public String getStatus() {
        return "x:" + positionX + " y:" + positionY + (sleep ? " Sleeping" : "Awakening");
    }

    public double getEyeSight() {
        return eyeSight;
    }
}