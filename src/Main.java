import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setMyArrayList(new ArrayList<>());

        Goods apple = new Goods(1, "Яблоко", 3);
        Goods water = new Goods(2, "Вода", 5);
        Goods cherry = new Goods(3, "Вишня", 4);
        Goods melon = new Goods(4, "Арбуз", 8);
        Goods lemon = new Goods(5, "Лимон", 7);
        Goods mango = new Goods(5, "Манго", 9);


        shop.addGoods(apple);
        shop.addGoods(water);
        shop.addGoods(cherry);
        shop.addGoods(melon);
        shop.addGoods(lemon);
        shop.getAllGoodsinAscending();
        shop.deleteGoods(2);
        shop.getAllGoods1InId();
        shop.editGoods(mango);
        shop.getAllGoods1InId();

    }
}
