package csc8011;

public class Exhibit {

        // Setters to assign exhibit values.  Set to private to take advantage of encapsulation.
        private String exhibitId;
        private String exhibitDescription;
        private int yearAcquired;
        private double exhibitValue;


        //Constructors to initialise the instance of the Exhibit class
        public Exhibit(String exhibitId, String exhibitDescription, int yearAcquired, double exhibitValue) {

                this.exhibitId = exhibitId;
                this.exhibitDescription = exhibitDescription;
                this.yearAcquired = yearAcquired;
                this.exhibitValue = exhibitValue;
        }

        //Getters set to public access levels to take advantage of encapsulation
        public String getExhibitId()
        {
                return exhibitId;
        }

        public String getExhibitDescription()
        {
                return exhibitDescription;
        }

        public int getYearAcquired()
        {
                return yearAcquired;
        }

        public double getExhibitValue()
        {
                return exhibitValue;
        }

// instance method to override the toString() method.  Provides a string representation of the exhibit details
@Override
public  String toString()
                {
                return String.format("ExhibitID: " + exhibitId + " Description: " + exhibitDescription + " Year Acquired: " + yearAcquired + " Value: " + exhibitValue);
                }
}

