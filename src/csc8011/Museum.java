package csc8011;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Museum {

    public String name;

    private ArrayList<Exhibit> exhibits = new ArrayList<>();

    //Constructor
    public Museum(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Exhibit> getExhibits(){
        return exhibits;
    }

// Method to return the highest value exhibit
    public Exhibit highestValueExhibit() {
        double highestValue = getExhibits().get(0).getExhibitValue();
        for (int i = 1; i < getExhibits().size(); i++) {
            if (highestValue < getExhibits().get(i).getExhibitValue()) {
                highestValue = getExhibits().get(i).getExhibitValue();
            }
        }
        return getExhibits().get((int) highestValue);
    }

    // Method to return the first exhibit acquired
    public Exhibit firstExhibitAcquired() {
        int min = getExhibits().get(0).getYearAcquired();
        int n = getExhibits().size();
        for (int i = 1; i < n; i++) {
            if (getExhibits().get(i).getYearAcquired() < min) {
                min = getExhibits().get(i).getYearAcquired();
            }
        }
        return getExhibits().get((int) min);
    }

    //Method to return average exhibit value
    public double averageValue() {
        OptionalDouble average = exhibits
                .stream()
                .mapToInt(a -> a.getYearAcquired())
                .average(); {
    return average.isPresent() ? average.getAsDouble() : 0;
        }
    }
}

