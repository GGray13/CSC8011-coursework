package csc8011;

import java.util.ArrayList;

public class Museum {

    public String name;

    private ArrayList<Exhibit> exhibits = new ArrayList<>();

    //Constructor
    public Museum(String name) {
        this.name = name;
    }

    public Museum() {
        name = "Vintage computer museum";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addExhibitName(Exhibit f) {
        return exhibits.add(f);
    }

    public ArrayList<Exhibit> getExhibits() {
        return exhibits;
    }

    // Method to return the highest value exhibit
    public Exhibit highestValueExhibit() {
        Exhibit maxValue = exhibits.get(0);
        for (Exhibit f : exhibits) {
            if (f.getExhibitValue() > maxValue.getExhibitValue()) {
                maxValue = f;
            }
        }
        return maxValue;
    }

    // Method to return the first exhibit acquired
    public Exhibit firstExhibitAcquired() {
        Exhibit minYear = exhibits.get(0);
        for (Exhibit f : exhibits) {
            if (f.getYearAcquired() < minYear.getYearAcquired()) {
                minYear = f;
            }
        }
        return minYear;
    }


    //Method to return average exhibit value
    public double averageValue() {
        double total = 0;
        for (Exhibit i : getExhibits()) {
            total += i.getExhibitValue();
        }
        return total / getExhibits().size();  //total value of exhibits divided by number of exhibits to get average.
    }
}


