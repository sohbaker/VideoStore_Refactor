import java.util.Vector;
import java.util.Enumeration;

public class Customer {
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(RentalType singleRental) {
        rentalRecord.addRentalToRecord(singleRental, this.name);
    }

    public String rentalStatement() {
        this.statement += "Rental Record for " + this.name + "\n";
        this.statement += rentalRecord.getDetailsOfMoviesRented();
        this.statement += "You owed " + rentalRecord.getTotalOwed() + "\n";
        this.statement += "You earned " + rentalRecord.getFrequentRenterPoints() + " frequent renter points\n";
        return this.statement;
    }

    private String name;
    private String statement = "";
    private RentalRecord rentalRecord = new RentalRecord();
}
