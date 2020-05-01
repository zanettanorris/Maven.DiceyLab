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
        System.out.println("*** \r\n" +
                "Simulation of " + numberOfDice + " dice tossed for " + numberOfRolls + " times.\r\n" +
                "***\r\n");
        HashMap<Integer, Integer> results = bin.getB();
        Float percent;
        for (Integer keySum : results.keySet()) {
            percent = calcPercent(bin.getBin(keySum), numberOfRolls);
            int rowOfStars;
//            rowOfStars = 0b1;
//Done: make the percent yield a decimal rather than a whole number. 0.17 instead of 17.
            int roundPercent = Math.round(percent);
            float decimalPercent = (roundPercent/100.00f);
//            System.out.println((String.format("%2d",keySum)) + "  :   " + (String.format("%6d",
//                    Math.round(bin.getBin(keySum)))) + " :  " + (String.format("%2d", Math.round(percent))) +
//                    " " +
//                    " " + printStars(Math.round(percent)));
            System.out.println((String.format("%2d",keySum)) + "  :   " + (String.format("%6d",
                    Math.round(bin.getBin(keySum)))) + " :  " + (( decimalPercent)) +
                    " " +
                    " " + printStars(Math.round(percent)));
        }
    }

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
