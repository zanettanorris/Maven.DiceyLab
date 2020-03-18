import java.util.HashMap;

public class Bins extends Dice {
    private HashMap<Integer, Integer> B = new HashMap<>();
    Integer n;

    public int getNumberOfDice(){
        return n;
    }
    public Bins(Integer n) {
       for (int i = n; i <= (n+(n*5)); i++)
            B.put(i, 0);
        }


    public Integer incrementBin(Integer binNumber) {
        Integer inc = 1;
        B.put((inc = inc++ ), B.get(inc));
        return inc;
    }

    public Integer getBin(Integer binNumber) {
        return B.get(binNumber);
    }
    public HashMap <Integer, Integer>  getB(){
        return B;
    }
}