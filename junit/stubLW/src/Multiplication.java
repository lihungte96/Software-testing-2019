import java.util.ArrayList;
import java.util.Iterator;

public class Multiplication {

    public Multiplication() {

    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int multiplicationWithFactorizationAbsolute(Factorization factorizationStub, int total) {
        // Multiply everything in ArrayList
        ArrayList<Integer> array = factorizationStub.factorization(total);
        if (array.size() < 2) {
            // Won't multiply single number
            return -1;
        }

        int ans = 1;
        Iterator<Integer> it = array.iterator();
        while (it.hasNext()) {
            ans *= it.next();
        }
        return ans;
    }

    public int multiplicationWithFactorization(Factorization factorizationStub, int total, boolean ifAbsolute) {
        // Multiply everything in ArrayList
        ArrayList<Integer> array = factorizationStub.factorization(total);
        if (array.size() < 2) {
            // Won't multiply single number
            return -1;
        }

        int ans = factorizationStub.factorizationRoot(total, ifAbsolute);
        Iterator<Integer> it = array.iterator();
        while (it.hasNext()) {
            ans *= it.next();
        }
        return ans;
    }
}