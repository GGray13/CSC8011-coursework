package csc8011;

public class Exhibit {

        // Set to private to take advantage of encapsulation.
        private String exhibitId;
        private String exhibitDescription;
        private int yearAcquired;
        private double exhibitValue;


        //Constructors
        public Exhibit(String exhibitId, String exhibitDescription, int yearAcquired, double exhibitValue) {

                this.exhibitId = exhibitId;
                this.exhibitDescription = exhibitDescription;
                this.yearAcquired = yearAcquired;
                this.exhibitValue = exhibitValue;
        }

        public Exhibit(String exhibitId, String exhibitDescription, String s, double exhibitValue) {
        }

        //Getters
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

        //Setters

        public void setExhibitId (String exhibitId)
        {
                this.exhibitId = exhibitId;
        }

        public void setExhibitDescription (String exhibitDescription)
        {
                this.exhibitDescription = exhibitDescription;
        }

        public void setYearAcquired (int yearAcquired)
        {
                this.yearAcquired = yearAcquired;
        }

        public void setExhibitValue (double exhibitValue)
        {
                this.exhibitValue = exhibitValue;
        }


@Override //To properly format output of methods
public  String toString()
                {
                return String.format("ExhibitID: " + exhibitId + " Description: " + exhibitDescription + " Year Acquired: " + yearAcquired + " Value: " + exhibitValue);
                }
}

