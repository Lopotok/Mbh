import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // txt fájl beolvasása
            BufferedReader txtReader = new BufferedReader(new FileReader("res/input.txt"));
            StringBuilder txtContent = new StringBuilder();
            String line;
            while ((line = txtReader.readLine()) != null) {
                txtContent.append(line).append("\n");
            }
            txtReader.close();


            String result = txtContent.toString()
                    .replace("<name>", "BONIVÁRT KRISZTIÁN")
                    .replace("<birthplace>", "Budapest")
                    .replace("<birthday>", "1989-03-15T11:07:14.561Z")
                    .replace("<folyamatban/felvéve/elutasítva>", "folyamatban")
                    .replace("<data1>", "MBH Bank")
                    .replace("<dátum>", "2024-05-12")
                    .replace("<data2>", "Documentum Management")
                    .replace("<data3>", "OOP")
                    .replace("<data4>", "Clean Code");



            System.out.println(result);

            // Eredmény kiírása egy új fájlba
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(result);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
