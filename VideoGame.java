import java.util.Random;

public class VideoGame {
    private static final int ALIENGANG = 10;
    public void play() {
        BetterAlienFactory af = new BetterAlienFactory();
        Alien[] aliens = new Alien[ALIENGANG];
        for (int i = 0; i < aliens.length; i++) {
            aliens[i] = af.getAlien();
            System.out.println(aliens[i]);
        }
    }
}
