import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FirstSketch extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    private List<Ball> balls;
    private int numBalls = 4;
    private int ballStep = HEIGHT / 5;
    private int startX = 0;
    private int baseSpeed = 1;
    private int circleDia = 10;

    public static void main(String[] args) {
        PApplet.main("FirstSketch", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        setupBalls();
    }

    private void setupBalls() {
        balls = new ArrayList<>();
        for (int i = 1; i <= numBalls; i++) {
            int currentBallY = ballStep * i;
            Ball curBall = Ball.fromInitPos(startX, currentBallY).withStep(baseSpeed * i);
            balls.add(curBall);
        }
    }

    @Override
    public void draw() {
        progressAndDrawBalls();
    }

    private void progressAndDrawBalls() {
        for (Ball ball : balls) {
            ball.progressHorizontally();
            drawBall(ball);
        }
    }

    private void drawBall(Ball ball) {
        int curX = ball.getX();
        int curY = ball.getY();
        ellipse(curX, curY, circleDia, circleDia);
    }
}
