import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");

        Stock( new Item("lolodmc69", 1000, 2));
        Stock( new Item("jeo9", 1000, 2));
    }
}
class Item {
    String code;
    double price;
    double quantity;

    public Item(String code, double price, double quantity) {
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }
    
}

public static class Stock{
    public Stock( List<Item> items){
    items.add(new Item(code, price, quantity));
    items
    }  
    public boolean isAvailableQuantity(Item x){
        if (items.equals(x.code) && Items.quantity < x.quantity) {
            return true;
        }
        return false;
    }
}

class ShopingCart{
    public ShopingCart( List<Item> cartItems){
        cartItems.add(new Item(code, price, quantity));
    }
    public void removeFromCart(Item item){
        if (cartItems.contains(item)) {
            cartItems.remove(item);
        }
    }

    public boolean add(Item item){
 return true;
    }
}