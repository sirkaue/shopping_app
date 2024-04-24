package model;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private Double limit;
    private Double balance;
    private List<Product> list;

    public CreditCard() {
    }

    public CreditCard(Double limit) {
        this.limit = limit;
        balance = limit;
        list = new ArrayList<>();
    }

    public boolean approvedPurchase(Product product) {
        if (balance > product.getPrice()) {
            balance -= product.getPrice();
            list.add(product);
            return true;
        }
        return false;
    }

    public Double getLimit() {
        return limit;
    }

    public Double getBalance() {
        return balance;
    }

    public List<Product> getList() {
        return list;
    }
}
