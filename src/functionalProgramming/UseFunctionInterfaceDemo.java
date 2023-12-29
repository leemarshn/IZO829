package functionalProgramming;

import java.math.BigInteger;
import java.util.function.Function;

/**
 * Created by Lee N on 29, Fri,Dec,2023.
 */
public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, BigInteger> factorial = (n) -> {
            BigInteger result = new BigInteger("1");
            for(int i=1; i <= n; i++)
                result = result.multiply(BigInteger.valueOf(i));
            return result;
        };
        System.out.println("Factorial: " + factorial.apply(111111));
}
}
