package util;

import service.CityBook;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CSVParser {
    public void readCitiesFromCSV(String fileName, CityBook cityBook) {

        Path path = Paths.get(fileName);

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine().replaceAll(";", "; ");
                String[] attributes = line.split(";");
                cityBook.createCity(attributes);
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

}
