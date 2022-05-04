import sweetGift.Candy;
import sweetGift.Jellybean;
import sweetGift.Gift;
/**
 * Task 3 part 2 from JAVA advanced
 * @author Abdurahmanov Rushan
 */
public class task3part2 {

    public static void main(String[] args) {
        Candy candies1 = new Candy("Bear in the north", 100, 200, "Russia");
        Candy candies2 = new Candy("grillage", 180, 180, "Belarus");
        Jellybean jellybeans1 = new Jellybean("Antoshka Kartoshka", 200, 150, 123654);
        Jellybean jellybeans2 = new Jellybean("Skazka", 250, 350, 6547497);

        Gift[] gift = {candies1, candies2, jellybeans1, jellybeans2};

        int totalPrice = 0;
        for (int i = 0; i < gift.length; i++) {
            totalPrice = totalPrice + gift[i].getPrice();
        }
        System.out.println("Total price = " + totalPrice + " rub.");

        int totalWeight = 0;
        for (int i = 0; i < gift.length; i++) {
            totalWeight = totalWeight + gift[i].getWeight();
        }
        System.out.println("Total weight = " + totalWeight + " gram.");

        Candy[] giftCandy = {candies1, candies2};
        for (Candy someGiftCandy : giftCandy) {
           System.out.println(someGiftCandy.toString() + ", " + someGiftCandy.toStringMadeIn());
        }
        Jellybean[] giftJellybean = {jellybeans1, jellybeans2};
        for (Jellybean someGiftJellybean : giftJellybean) {
            System.out.println(someGiftJellybean.toString() + ", " + someGiftJellybean.toStringArticleNumber());
        }
    }
}
