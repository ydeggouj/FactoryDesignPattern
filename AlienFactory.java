import java.util.Random;

public class AlienFactory {
    private enum AlienType {SQUID, MONKEY, TIGER, RAT}
    private static Random r = new Random();
    public Alien getAlien() {
        int n = r.nextInt(AlienType.values().length);
        AlienType t = AlienType.values()[n];
        Alien a = null;
        switch (t) {
            case SQUID:
                a = new SquidAlien();
                break;
            case MONKEY:
                a = new MonkeyAlien();
                break;
            case TIGER:
                a = new TigerAlien();
                break;
            case RAT:
                a = new RatAlien();
                break;
            default:
                System.out.println("Unknown Alien Type!");
                System.exit(1);
                //a = new Alien("Invalid Entry");
                break;


        }
        return a;
    }
}
