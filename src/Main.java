import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Goods apple = new Goods(1, "Яблоко", 3);
        Goods water = new Goods(2, "Вода", 5);
        Goods cherry = new Goods(3, "Вишня", 4);
        Goods melon = new Goods(4, "Арбуз", 8);
        Goods lemon = new Goods(5, "Лимон", 7);
        Goods mango = new Goods(5, "Манго", 9);


        Application application = new Application(new Shop());

        application.getShop().addGoods(apple);
        application.getShop().addGoods(water);
        application.getShop().addGoods(cherry);
        application.getShop().addGoods(melon);
        application.getShop().addGoods(lemon);

        application.chooseAction();

    }
}
