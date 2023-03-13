package util;

import model.City;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Grouping {

    private Grouping() {

    }

    public static void byRegion(List<City> cities) {
        Map<String, Long> map = cities.stream().collect(
                Collectors.groupingBy(City::getRegion, Collectors.counting()));
        map.entrySet().forEach(System.out::println);

    }
}

