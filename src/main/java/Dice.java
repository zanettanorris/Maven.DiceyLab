import java.util.Random;

public class Dice {
    private int numberOfDice;
    private Random rgen;
    private Integer numberOfRolls;
    private Integer die1;
    private Integer die2;

    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
        this.rgen = new Random();
    }

    public Integer outcomeStart(int numberOfDice) {
        int outcomeStart = this.numberOfDice;
        return outcomeStart;
    }

    public Integer outcomeStop(int numberOfDice) {
        int outcomeStop = ((numberOfDice) + numberOfDice * 5);
        return outcomeStop;
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
public int getNumberOfDice(){
        return this.numberOfDice;
}
public Dice(){}
    public void tossAndSum() {
    }
}

