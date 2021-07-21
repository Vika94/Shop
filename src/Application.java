import java.util.Scanner;

public class Application {

    private Shop shop;

    public Application(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void chooseAction() {
        for (; ; ) {
            System.out.print("Выберите действие и нажмите соответствующую цифру:" +
                    "\n1 - Вывести товар" +
                    "\n2 - Добавить товар" +
                    "\n3 - Удалить товар" +
                    "\n4 - Редактировать товар" +
                    "\n5 - Выход");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            if (n == 1) {
                outputOfAllProducts();
                continue;
            } else if (n == 2) {
                addGoodsInShop();
                continue;
            } else if (n == 3) {
                deleteGoodsInShop();
                continue;
            } else if (n == 4) {
                editGoodsInShop();
                continue;
            } else if (n == 5) {
                return;
            }
        }
    }

    public void outputOfAllProducts() {
        System.out.print("Выберите сортировку товара:" +
                "\n1 - по убыванию цены" +
                "\n2 - по возрастанию цены" +
                "\n3 - по дате добавление,сначала последние");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 1) {
            shop.getAllGoodsInWaning();
        } else if (n == 2) {
            shop.getAllGoodsInAscending();
        } else if (n == 3) {
            shop.getAllGoods1InId();
        }
    }

    public void addGoodsInShop() {
        System.out.print("Для добавления товара введите:" +
                "\nid" +
                "\nname" +
                "\nprice");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        int price = scan2.nextInt();
        Goods goods = new Goods(id, name, price);
        shop.addGoods(goods);
    }

    public void deleteGoodsInShop() {
        System.out.print("ВВедите id товара, который хотите удалить");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        shop.deleteGoods(id);

    }

    public void editGoodsInShop() {
        System.out.print("Введите id товара, который хотите изменить:");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        System.out.print("Введите имя и цену нового товара:");
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        int price = scan2.nextInt();
        Goods goods = new Goods(id, name, price);
        shop.editGoods(goods);
    }
}
