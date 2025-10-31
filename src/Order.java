
import java.util.Arrays;
import java.util.Objects;

public class Order {
    public String customer;
    public Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказ [клиент=" + customer + ", корзина=" + Arrays.toString(basket) + "]";
    }

    public String getCustomer() {
        return customer;
    }

    public Product[] getBasket() {
        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        if (basket == null && order.basket == null) return true;
        if (basket == null || order.basket == null) return false;
        if (basket.length != order.basket.length) return false;
        for (int i = 0; i < basket.length; i++) {
            Product product1 = basket[i];
            Product product2 = order.basket[i];
            if (product1 == null && product2 == null) continue;
            if (product1 == null || product2 == null) return false;
            if (!product1.equals(product2)) return false;
        }
        return true;
    }
}