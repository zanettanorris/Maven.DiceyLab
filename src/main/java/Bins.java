import java.util.HashMap;

public class Bins extends Dice {
    private HashMap<Integer, Integer> B = new HashMap<>();
    Integer numberOfDice;

    public int getNumberOfDice(){
        return numberOfDice;
    }

    public Bins(Integer numberOfDice) {
       for (int i = numberOfDice; i <= (numberOfDice*6); i++)
            B.put(i, 0);
    }
//
//    public Integer incrementBin(Integer binNumber) {
//        Integer inc = 1;
//        B.put(( inc = inc++ ),
//                B.get(inc));
//        return inc;
//    }

    public void incrementBin(Integer binNumber){
        Integer oldValue = B.get(binNumber);
        Integer newValue = oldValue + 1 ;
        B.put(binNumber, newValue);

    }

    public Integer getBin(Integer binNumber) {
        return B.get(binNumber);
    }

    public HashMap <Integer, Integer>  getB(){
        return B;
    }
}
