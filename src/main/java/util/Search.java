package util;

import model.City;

import java.util.List;

public final class Search {

    private static City[] array;

    private static int findIndexOfMax(List<City> cities) {
        array = fromListToArray(cities);

        int indexOfMax = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i].getPopulation() > array[indexOfMax].getPopulation()) {
                indexOfMax = i;
            }
        }

        return indexOfMax;
    }

    private static City[] fromListToArray(List<City> cities) {
        array = new City[cities.size()];
        cities.toArray(array);
        return array;
    }

    public static void printIndexAndValueOfMax(List<City> cities) {
        if (!(cities == null || cities.isEmpty())) {
            int indexOfMax = findIndexOfMax(cities);
            System.out.println("[" + indexOfMax + "]" + " = " + array[indexOfMax].getPopulation());
        } else {
            System.out.println("List cities is empty.");
        }
    }
}
