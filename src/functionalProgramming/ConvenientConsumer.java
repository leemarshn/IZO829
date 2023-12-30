package functionalProgramming;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Created by Lee N on 30, Sat,Dec,2023.
 */
public class ConvenientConsumer {
    public static void main(String[] args) {

        Consumer<Double> valid_discount = (amount) -> {
            if(amount <10000){
                System.out.println("No Discount");
            }else {
                double discount = amount * 5/100;
                System.out.print("Spend kes, " + amount + " and Save kes, " + discount);
            }
        };
        Consumer<Double> charity = (amount) -> {
            double charity_amount = (amount - (amount * 16/100)) * 2/100;
            System.out.println(". Kes " + charity_amount + " Will go to charity");
        };

        Consumer<Double> expense = charity.andThen(valid_discount);

        expense.accept(11000.00);

    }
}
