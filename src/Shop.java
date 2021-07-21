import java.util.*;

public class Shop {
    private List<Goods> myArrayList;
    public Shop() {
        this.myArrayList = new ArrayList<>();
    }

    public List<Goods> getMyArrayList() {
        return myArrayList;
    }


    public void addGoods(Goods goods) {
        if (myArrayList.size() == 0) {
            myArrayList.add(goods);
            return;
        }
        for (Goods i : myArrayList) {
            if (i.getId() == goods.getId()) {
                System.out.println("Товар с данным id уже существует");
                return;
            }

        }
        myArrayList.add(goods);
    }


    public List<Goods> getAllGoodsInAscending() {
        Collections.sort(myArrayList);
        System.out.println(myArrayList.toString());
        return myArrayList;
    }
    public List<Goods> getAllGoodsInWaning() {
        Collections.sort(myArrayList, Collections.reverseOrder());
        System.out.println(myArrayList.toString());
        return myArrayList;
    }

    public void getAllGoods1InId() {
        Comparator<Goods> idComparator = new Sort();
        Collections.sort(myArrayList, idComparator);
        System.out.println(myArrayList);
    }


    public void deleteGoods(int id) {
        Iterator<Goods> goodsIterator = myArrayList.iterator();
        while (goodsIterator.hasNext()) {
            Goods nextGoods = goodsIterator.next();
            if (nextGoods.getId() == id) {
                goodsIterator.remove();
            }
        }
    }

    public void editGoods(Goods goods) {
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).getId() == goods.getId()) {
                myArrayList.set(i, goods);
                return;
            }
        }
    }
}






