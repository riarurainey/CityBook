package service;

import model.City;

import java.util.ArrayList;
import java.util.List;

public class CityBook {
    static List<City> cities = new ArrayList<>();

    public static void createCity(String[] attributes) {
        String name = validateFields(attributes[1]);
        String region = validateFields(attributes[2]);
        String district = validateFields(attributes[3]);
        Long population = parseLongSafe(validateFields(attributes[4]));
        String foundation = validateFields(attributes[5]);
        City city = City.builder()
                .setName(name)
                .setRegion(region)
                .setDistrict(district)
                .setPopulation(population)
                .setFoundation(foundation).build();

        addToBook(city);
    }

    private static void addToBook(City city) {
        cities.add(city);
    }

    public void printCityBook() {
        for (City city : cities) {
            System.out.println(city);
        }
    }

    private static String validateFields(String field) {
        return field.trim().isEmpty() ? null : field.trim();
    }

    private static Long parseLongSafe(String field) {
        try {
            return Long.parseLong(field);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
