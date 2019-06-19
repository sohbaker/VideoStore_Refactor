import java.util.Vector;
import java.util.Enumeration;

public class Customer {
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(RentalType singleRental) {
        rentals.addElement(singleRental);
    }

    public String getCustomerName() {
        return name;
    }

    public String rentalStatement() {
        double totalOwed = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String statement = "RentalType Record for " + getCustomerName() + "\n";

        while (rentals.hasMoreElements()) {
            double calculateTotal = 0;
            RentalType eachRental = (RentalType) rentals.nextElement();
            calculateTotal += eachRental.getTotalRentalCost();

            frequentRenterPoints++;

            if (eachRental.getType() == "New Release"
                    && eachRental.getDaysRented() > 1)
                frequentRenterPoints++;

            statement += "\t" + eachRental.getTitle() + "\t"
                    + calculateTotal + "\n";
            totalOwed += calculateTotal;
        }

        statement += "You owed " + totalOwed + "\n";
        statement += "You earned " + frequentRenterPoints + " frequent renter points\n";

        return statement;
    }


    private String name;
    private Vector rentals = new Vector();
}
