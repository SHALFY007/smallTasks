import java.util.ArrayList;
import java.util.LinkedList;

public class Day11 {
    public static void main(String[] args) {
        GoodsLinked goods = new GoodsLinked();
        goods.addNewGood("Good-1");
        goods.addNewGood("Good-2");
        goods.addNewGood("Good-3");
        goods.removeGood("Good-3");
        goods.showAllGoods();

    }

}

class GoodsLinked {
    LinkedList<String> goods;
    public GoodsLinked() {
        this.goods = new LinkedList<String>();
    }
    void addNewGood(String good) {
        goods.add(good);
    }
    void removeGood(String good) {
        goods.remove(good);
    }
    void showAllGoods() {
        for (String i: goods) {
            System.out.println(i);
        }
    }
}
