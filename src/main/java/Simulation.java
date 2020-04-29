import java.util.HashMap;

public class Simulation {
    private Integer numberOfDice;
    private Integer numberOfRolls;
    private Bins bin;
    private Dice dice;
    private Integer highestPossibleOutcome;


    public Simulation(Integer numberOfDice, Integer numberOfRolls) {
        this.highestPossibleOutcome = highestPossibleOutcome;
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
//            rowOfStars = 0b1;

            System.out.println((String.format("%2d",keySum)) + "  :   " + (String.format("%6d",
                    Math.round(bin.getBin(keySum)))) + " :  " + (String.format("%2d",Math.round(percent))) +
                    " " +
                    " " + printStars(Math.round(percent)));

        }
    }
//TODO should be total number of rolls of that number, not sumOfRoll;
    public Float calcPercent(Integer inc, Integer numberOfRolls) {
        HashMap<Integer, Integer> results = bin.getB();
        Float percentValue = 0f;
        for (Integer keySum : results.keySet()) {
             percentValue = (float) (inc) / numberOfRolls * 100;
        }
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
