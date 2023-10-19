package ru.gb.lesson6.src2;

import java.io.FileWriter;
import java.io.IOException;

public class SafeFile extends NewOder {

    NewOder oder = new NewOder();

    public SafeFile(NewOder oder) {
        this.oder = oder;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.clientName + "\",\n");
            writer.write("\"product\":\""+ this.product +"\",\n");
            writer.write("\"qnt\":"+ this.qnt +",\n");
            writer.write("\"price\":"+ this.price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
