package ru.gb.lesson6.src2;

import java.util.Scanner;

public class DataInput extends NewOder{

    private NewOder order = new NewOder();

    Scanner scanner =new Scanner(System.in);

    public DataInput(NewOder order) {
        this.order = order;
    }

    public void inputFromConsole(){
        this.clientName = prompt("Client name: ");
        this.product = prompt("Product: ");
        this.qnt = Integer.parseInt(prompt("Quantity: "));
        this.price = Double.parseDouble(prompt("Price: "));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
