import java.util.Random;

public class BetterAlienFactory {
    private enum AlienType {SquidAlien, MonkeyAlien, TigerAlien, RatAlien}
    private static Random r = new Random();
    public Alien getAlien() {
        int n = r.nextInt(AlienType.values().length);
        AlienType t = AlienType.values()[n];
        Alien alien = null;
        try {
            alien =
                    (Alien) (Class.forName(t.toString()).getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            System.out.println("Unknown Alien Type");
        }
        return alien;
    }
}
