package service;

import model.City;

import java.util.ArrayList;
import java.util.List;

public class CityBook {
    
    private List<City> cities = new ArrayList<>();

    public void createCity(String[] attributes) {
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


    private void addToBook(City city) {
        cities.add(city);
    }

    public void printCityBook() {
        cities.forEach(System.out::println);
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    private String validateFields(String field) {
        return field.trim().isEmpty() ? null : field.trim();
    }

    private Long parseLongSafe(String field) {
        try {
            return Long.parseLong(field);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
}
