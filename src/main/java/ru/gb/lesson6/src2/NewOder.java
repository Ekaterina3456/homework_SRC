package ru.gb.lesson6.src2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewOder {

    public String clientName;
    public String product;
    public int qnt;
    public double price;

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public NewOder(){

    }

    public NewOder(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
}
