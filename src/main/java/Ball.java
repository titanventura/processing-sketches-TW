public class Ball {
    private int x;
    private int y;
    private int step;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public Ball(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public static Ball fromInitPos(int currentBallX, int startY) {
        return new Ball(currentBallX, startY);
    }

    public Ball withStep(int step) {
        this.setStep(step);
        return this;
    }

    public void progressHorizontally() {
        this.setX(this.getX() + this.getStep());
    }
}
