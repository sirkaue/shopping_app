package model;

public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Produto(s): " +
                "nome: " + name +
                ", preço: " + price;
    }

    @Override
    public int compareTo(Product product) {
            return price.compareTo(product.price);
    }
}
