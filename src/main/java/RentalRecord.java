import java.util.*;

public class RentalRecord {
    public void addRentalToRecord(RentalType singleRental) {
        rentals.addElement(singleRental);
    }

    public double getTotalOwed() {
        double totalOwed = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            RentalType eachRental = (RentalType) rentals.nextElement();
            totalOwed += eachRental.getTotalRentalCost();
        }
        return totalOwed;
    }

    public String getDetailsOfMoviesRented() {
        String moviesRented = "";
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            RentalType eachRental = (RentalType) rentals.nextElement();
            moviesRented += "\t" + eachRental.getTitle() + "\t"
                    + eachRental.getTotalRentalCost() + "\n";
        }
        return moviesRented;
    }

    public int getFrequentRenterPoints() {
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            frequentRenterPoints++;
            RentalType eachRental = (RentalType) rentals.nextElement();
            if (eachRental.getType() == "New Release" && eachRental.getDaysRented() > 1) frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private int frequentRenterPoints = 0;
    private Vector rentals = new Vector();
}
