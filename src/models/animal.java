package models;

public abstract class animal {
    private String species;
    private Double weight;

    protected animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public Double getWeight() {
        return weight;
    }

}
