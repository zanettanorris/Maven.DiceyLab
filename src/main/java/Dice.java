import java.util.Random;

public class Dice {
    private int numberOfDice;
    private Random rgen;
    private Integer numberOfRolls;
    private Integer die1;
    private Integer die2;

    public Dice (Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
        this.rgen = new Random();
    }

public Integer toss() {
    int x = 0;
    for (int i = 0; i < numberOfDice; i++) {
        x += (rgen.nextInt(6) + 1);
    }
    return x;
}
    public void setSeed() {
        this.rgen.setSeed(17L);
    }

        }

