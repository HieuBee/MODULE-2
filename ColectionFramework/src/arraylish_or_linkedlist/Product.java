package arraylish_or_linkedlist;

import java.util.Scanner;

public class Product {
    private int idProduct;
    private String nameProduct;
    private int priceProduct;

    public Product() {

    }

    public Product(int idProduct, String nameProduct, int priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }

//    public void inputProduct() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please input id product: ");
//        idProduct = sc.nextInt();
//        System.out.println("Please input name product: ");
//        nameProduct = sc.next();
//        System.out.println("Please input price product: ");
//        priceProduct = sc.nextDouble();
//    }
//
//    public void displayProduct() {
//        System.out.println("Id = " + getIdProduct());
//        System.out.println("Name = " + getNameProduct());
//        System.out.println("Price = " + getPriceProduct());
//    }
}
