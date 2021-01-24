package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "isin_number")
public class User
{
    @Id
    private String STOCK_SYMBOL;
    private String STOCK_NAME;
    private String ISIN;

    public User()
    {
    }

    public User(String STOCK_SYMBOL, String STOCK_NAME, String ISIN) {
        this.STOCK_SYMBOL = STOCK_SYMBOL;
        this.STOCK_NAME = STOCK_NAME;
        this.ISIN = ISIN;
    }


    public String getSTOCK_SYMBOL()
    {
        return STOCK_SYMBOL;
    }
    public String getSTOCK_NAME() {
        return STOCK_NAME ;
    }

    public String getISIN() {
        return ISIN;
    }
}
//other setters and getters}