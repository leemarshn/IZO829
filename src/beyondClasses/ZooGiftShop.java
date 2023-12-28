package beyondClasses;

/**
 * Created by Lee N on 28, Thu,Dec,2023.
 */
public class ZooGiftShop {
    interface SaleTodayOnly {
        int dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        System.out.println(new ZooGiftShop().admission(23));
    }
}
