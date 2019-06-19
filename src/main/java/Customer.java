import java.util.Vector;
import java.util.Enumeration;

public class Customer {
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(RentalType singleRental) {
        rentals.addElement(singleRental);
    }

    public String rentalStatement() {
        this.statement += "RentalType Record for " + this.name + "\n";
        this.statement += detailsOfMoviesRented();
        this.statement += "You owed " + calculateTotalOwed() + "\n";
        this.statement += "You earned " + calculateFrequentRenterPoints() + " frequent renter points\n";
        return this.statement;
    }

    private String name;
    private String statement = "";
    private int frequentRenterPoints = 0;
    private Vector rentals = new Vector();

    private double calculateTotalOwed() {
        double totalOwed = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            RentalType eachRental = (RentalType) rentals.nextElement();
            totalOwed += eachRental.getTotalRentalCost();
            this.statement += "\t" + eachRental.getTitle() + "\t"
                    + totalOwed + "\n";
        }
        return totalOwed;
    }

    private String detailsOfMoviesRented() {
        String moviesRented = "";
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            RentalType eachRental = (RentalType) rentals.nextElement();
            moviesRented += "\t" + eachRental.getTitle() + "\t"
                    + eachRental.getTotalRentalCost() + "\n";
        }
        return moviesRented;
    }

    private int calculateFrequentRenterPoints() {
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            frequentRenterPoints++;
            RentalType eachRental = (RentalType) rentals.nextElement();
            if (eachRental.getType() == "New Release" && eachRental.getDaysRented() > 1) frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}
