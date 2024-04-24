package model;

public class Account {
    private Integer id;
    private String name;
    private CreditCard limitCard;


    public Account() {
    }

    public Account(Integer id, String name, CreditCard limitCard) {
        this.id = id;
        this.name = name;
        this.limitCard = limitCard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreditCard getLimitCard() {
        return limitCard;
    }
}
