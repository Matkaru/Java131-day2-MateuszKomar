package Task24;

public class MainTask24 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        removeFromBasket(basket);
        removeFromBasket(basket);
        removeFromBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);



    }

    private static void removeFromBasket(Basket basket) {
        try {
            basket.removeFromBasket();
        } catch (BasketEmptyException e) {
            System.out.println("cokolwiek");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("wykonam się zawsze");
        }
    }

    private static void addToBasket(Basket basket) {
        try {
            basket.addToBasket();
        } catch (BasketFullException e) {
            System.out.println("cokolwiek");
            System.out.println(e.getMessage());
        }
    }
}