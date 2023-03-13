package util;

import model.City;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class Sort {

    private Sort() {

    }

    public static List<City> sortedByName(List<City> cities) {
        return cities.stream()
                .sorted(Comparator.comparing(City::getName, String::compareToIgnoreCase))
                .collect(Collectors.toList());
    }

    public static List<City> sortedByDistrictAndName(List<City> cities) {
        return cities.stream()
                .sorted(Comparator.comparing(City::getDistrict)
                        .thenComparing(City::getName))
                .collect(Collectors.toList());
    }
}
