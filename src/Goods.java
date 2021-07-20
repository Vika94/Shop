public class Goods implements Comparable<Goods> {

    private int id;
    private String name;
    private int price;

    public Goods(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}' + "\n";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Goods o) {
        int tmp = this.price - ((Goods) o).price;
        if (tmp == 0) {
            return this.id - ((Goods) o).id;
        } else {
            return tmp;
        }

    }
}
