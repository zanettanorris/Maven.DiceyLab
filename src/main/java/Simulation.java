import java.util.HashMap;

public class Simulation {
    private Integer numberOfDice;
    private Integer numberOfRolls;
    private Bins bin;
    private Dice dice;

    public Simulation(Integer numberOfDice, Integer numberOfRolls) {

        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
        this.bin = new Bins(numberOfDice);
        this.dice = new Dice(numberOfDice);
    }

    public void runSimulation() {
        Integer sumOfRoll = 0;
        for (int i = 0; i < numberOfRolls; i++) {
            sumOfRoll = dice.toss();
            bin.incrementBin(sumOfRoll);
        }

    }

    public void printResults() {
        HashMap<Integer, Integer> results = bin.getB();
        Float percent;
        for (Integer keySum : results.keySet()) {
            percent = calcPercent(bin.getBin(keySum), numberOfRolls);
            int rowOfStars;
            rowOfStars = 0b1;
            System.out.println(keySum + "  :   " + Math.round(bin.getBin(keySum)) + " :  " + Math.round(percent) + "  " + printStars(rowOfStars));

        }
    }

    public Float calcPercent(Integer sumOfRoll, Integer numberOfRolls) {
        Float percentValue = (float) sumOfRoll / numberOfRolls * 100;
        return percentValue;

    }

    public String printStars(Integer numberOfStars) {
        String rowOfStars = "";
        for (int i = 0; i < numberOfStars; i++) {
            rowOfStars += "*";
        }
        return rowOfStars;
    }


}
