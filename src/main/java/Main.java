import service.CityBook;
import util.CSVParser;
import util.Search;


public class Main {
    public static void main(String[] args) {
        CityBook cityBook = new CityBook();
        CSVParser csvParser = new CSVParser();
        csvParser.readCitiesFromCSV("src/main/resources/city_ru.csv", cityBook);
        Search search = new Search();
        search.printIndexAndValueOfMax(cityBook.getCities());

    }
}
