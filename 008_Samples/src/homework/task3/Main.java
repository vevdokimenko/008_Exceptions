package homework.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 2;
        Price[] prices = new Price[count];

        for (int i = 0; i < count; i++) {
            System.out.printf("Введите данные о %s товаре в виде: Название, Магазин, Цена:\n", i + 1);
            prices[i] = new Price(sc.nextLine().split(","));
            System.out.println(prices[i]);
        }

        Arrays.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.getShop().compareTo(o2.getShop());
            }
        });

        System.out.println("Введите название магазина, для показа его товаров: ");
        String shop = sc.nextLine();
        try {
            findShop(shop, prices);
        } catch (ShopException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void findShop(String shop, Price[] prices) throws ShopException {
        boolean find = false;
        for (Price item : prices) {
            if (item.getShop().equals(shop)) {
                System.out.println(item);
                find = true;
            }
        }
        if (!find)
            throw new ShopException();
    }
}
