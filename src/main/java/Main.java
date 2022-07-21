import service.CityBook;
import util.CSVParser;
import util.Sort;


public class Main {
    public static void main(String[] args) {
        CityBook cityBook = new CityBook();
        CSVParser csvParser = new CSVParser();
        csvParser.readCitiesFromCSV("src/main/resources/city_ru.csv", cityBook);
        Sort sort = new Sort();

        System.out.println("Список городов отсортированный по наименованию: ");
        cityBook.setCities(sort.sortedByName(cityBook.getCities()));
        cityBook.printCityBook();
        System.out.println();

        System.out.println("Список городов отсортированный по двум полям – федеральному округу и наименованию города: ");
        cityBook.setCities(sort.sortedByDistrictAndName(cityBook.getCities()));
        cityBook.printCityBook();

    }
}
