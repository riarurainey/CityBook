package model;

public class City {
    private final String name;
    private final String region;
    private final String district;
    private final Long population;
    private final String foundation;

    private City(String name, String region, String district, Long population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getDistrict() {
        return district;
    }

    public Long getPopulation() {
        return population;
    }

    public String getFoundation() {
        return foundation;
    }

    public static class Builder {
        private String name;
        private String region;
        private String district;
        private Long population;
        private String foundation;

        private Builder() {

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = region;
            return this;
        }

        public Builder setDistrict(String district) {
            this.district = district;
            return this;
        }

        public Builder setPopulation(Long population) {
            this.population = population;
            return this;
        }

        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public City build() {
            return new City(name, region, district, population, foundation);
        }

    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
