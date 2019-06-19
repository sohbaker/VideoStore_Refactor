import java.util.Vector;
import java.util.Enumeration;

public class Customer {
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental singleRental) {
        rentals.addElement(singleRental);
    }

    public String getCustomerName() {
        return name;
    }

    public String rentalStatement() {
        double totalOwed = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String statement = "Rental Record for " + getCustomerName() + "\n";

        while (rentals.hasMoreElements()) {
            double calculateTotal = 0;
            Rental eachRental = (Rental) rentals.nextElement();

            // determines the amount for each line
            switch (eachRental.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    calculateTotal += 2;
                    if (eachRental.getDaysRented() > 2)
                        calculateTotal += (eachRental.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    calculateTotal += eachRental.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    calculateTotal += 1.5;
                    if (eachRental.getDaysRented() > 3)
                        calculateTotal += (eachRental.getDaysRented() - 3) * 1.5;
                    break;
            }

            frequentRenterPoints++;

            if (eachRental.getMovie().getPriceCode() == Movie.NEW_RELEASE
                    && eachRental.getDaysRented() > 1)
                frequentRenterPoints++;

            statement += "\t" + eachRental.getMovie().getTitle() + "\t"
                    + String.valueOf(calculateTotal) + "\n";
            totalOwed += calculateTotal;
        }

        statement += "You owed " + String.valueOf(totalOwed) + "\n";
        statement += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";

        return statement;
    }


    private String name;
    private Vector rentals = new Vector();
}
