import processing.core.PApplet;

public class FirstSketch extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    private int fifthOfTheHeight = HEIGHT / 5;
    private int circleDia = 10;
    private int numStreams = 4;
    private int horizontalPosition = 0;

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
    }

    @Override
    public void draw() {
        for (int i = 1; i <= numStreams; i++) {
            ellipse(horizontalPosition * i, fifthOfTheHeight * i, circleDia, circleDia);
        }
        horizontalPosition++;
    }
}
