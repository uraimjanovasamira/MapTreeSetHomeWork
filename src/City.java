public class City implements Comparable<City> {
    private String name;
    private int population;
    private String country;
    private int code;

    @Override
    public int compareTo(City o) {
        return o.getCode() - getCode();
    }

    public City(String name, int population, String country, int code) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", code=" + code +
                '}';
    }


}
