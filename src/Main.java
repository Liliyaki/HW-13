import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(2511, "Apple", 95000, "Телефон");
        Product product2 = new Product(2611, "Apple", 102000, "Телефон");
        Product product3 = new Product(2812, "Samsung", 40000, "Телефон");
        Product product4 = new Product(2812, "Samsung", 40000, "Телефон");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println("Товары 1 и 2 одинаковые = " + product1.equals(product2));
        System.out.println("Товары 2 и 3 одинаковые = " + product2.equals(product3));
        System.out.println("Товары 3 и 4 одинаковые = " + product3.equals(product4));
        Product[] basket1 = {product2};
        Product[] basket2 = {product2};
        Product[] basket3 = {product2, product1};
        Product[] basket4 = {product3, product4};
        Order order1 = new Order("Наталья", basket1);
        Order order2 = new Order("Илья", basket2);
        Order order3 = new Order("Николай", basket3);
        Order order4 = new Order("Алексей", basket4);
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println("Заказы 1 и 2 одинаковые = " + order1.equals(order2));
        System.out.println("Заказы 2 и 3 одинаковые = " + order2.equals(order3));
        System.out.println("Заказы 3 и 4 одинаковые = " + order3.equals(order4));
    }
}