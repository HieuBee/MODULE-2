package arraylish_or_linkedlist;

import java.util.*;

public class ProductManger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        Product productFirst = new Product(1, "Ao", 21000);
        Product productSecond = new Product(2, "Quan", 121000);
        Product productThird = new Product(3, "Giay", 450000);

        productList.add(productFirst);
        productList.add(productSecond);
        productList.add(productThird);

        int select = 0;

        do {
            System.out.println("============================");
            System.out.println("1. Add product.");
            System.out.println("2. Display product.");
            System.out.println("3. Remove product.");
            System.out.println("4. Search product.");
            System.out.println("5. Sort product.");
            System.out.println("6. Update product.");
            System.out.println("0. Exit.");
            System.out.println("Please input number: ");
            select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1: //Add product
                    System.out.print("Input id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Input name: ");
                    String name = sc.nextLine();
                    System.out.print("Input price: ");
                    int price = Integer.parseInt(sc.nextLine());
                    Product productAdd = new Product(id, name, price);

                    productList.add(productAdd);
                    System.out.println(productAdd);
                    break;
                case 2: //Display productList
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println(productList.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Input id: ");
                    int idSearch = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getIdProduct() == idSearch){
                            productList.remove(i);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Input id: ");
                    int newId = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getIdProduct() == newId){
                            System.out.println(productList.get(i));
                        }
                    }
                    break;
                case 5:
                    Collections.sort(productList, new SortByPrice());
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println(productList.get(i));
                    }
                    break;
                case  6:
                    System.out.println("Input id: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getIdProduct() == updateId) {
                            System.out.println("Input name: ");
                            String updateName = sc.nextLine();
                            System.out.println("Input price: ");
                            int updatePrice = Integer.parseInt(sc.nextLine());

                            Product updateProduct = new Product(productList.get(i).getIdProduct(), updateName, updatePrice);
                            productList.set(i, updateProduct);

                            System.out.println(productList.get(i));
                        }
                    }
                    break;
            }
        } while (true);
    }
}
