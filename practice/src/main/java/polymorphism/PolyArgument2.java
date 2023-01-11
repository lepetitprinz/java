package polymorphism;

class ProductNew {
    int price;
    int bonusPoint;

    ProductNew (int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    ProductNew() {}
}

class TvNew extends ProductNew {
    TvNew () { super(100); }

    public String toString() { return "TvNew"; }
}

class ComputerNew extends ProductNew {
    ComputerNew () { super(200); }

    public String toString() { return "ComputerNew"; }
}

class   Audio extends ProductNew {
    Audio () { super(50); }
    public String toString() { return "Audio"; }
}

class BuyerNew {
    int money = 1000;
    int bonusPoint = 0;
    ProductNew [] item = new ProductNew[10];
    int i = 0;

    void buy(ProductNew p) {
        if (money < p.price) {
            System.out.println("Out of Money");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println("You are buying: " + p);
    }

    void summary() {
        int sum = 0;
        StringBuilder itemList = new StringBuilder();

        for (ProductNew p : item) {
            if (p == null) break;
            sum += p.price;
            itemList.append(p).append(", ");
        }

        System.out.println("Total Price of buying: " + sum);
        System.out.println("Purchasing item list: " + itemList);
    }
}


public class PolyArgument2 {
    public static void main(String[] args) {
        BuyerNew b = new BuyerNew();

        b.buy(new TvNew());
        b.buy(new ComputerNew());
        b.buy(new Audio());
        b.summary();
    }
}
