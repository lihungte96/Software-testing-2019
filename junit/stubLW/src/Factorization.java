import java.util.ArrayList;

public interface Factorization {

    // factorization(15) = 3 * 5
    public ArrayList<Integer> factorization(int total);

    // rootValue is negative && ifAbsolute is false, return -1
    public int factorizationRoot(int rootValue, boolean ifAbsolute);

}