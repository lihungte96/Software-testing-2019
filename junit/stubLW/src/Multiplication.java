import java.util.ArrayList;
import java.util.Iterator;

public class Multiplication {

    public Multiplication() {

    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int multiplicationWithArray(ArrayList<Integer> array) {
        // Multiply everything in ArrayList
        if (array.size() < 2) {
            return -1;
        }

        int ans = 1;
        Iterator<Integer> it = array.iterator();
        while (it.hasNext()) {
            ans *= it.next();
        }
        return ans;
    }
}