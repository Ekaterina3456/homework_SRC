package ru.gb.lesson6.src2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {


        NewOder order = new NewOder();
        DataInput dataInput = new DataInput(order);
        SafeFile safeFile = new SafeFile(order);
        dataInput.inputFromConsole();
        safeFile.saveToJson();
    }
}
