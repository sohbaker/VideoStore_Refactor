import java.util.*;

public class RentalRecord {
    private ArrayList<Rental> rentals = new ArrayList<>();

    public void addRentalToRecord(Rental rental) {
        rentals.add(rental);
    }

    public String getDetailsOfMoviesRented() {
        String moviesRented = "";
        for (Rental rental : rentals) {
            moviesRented += "\t" + rental.getTitle() + "\t\t"
                    + rental.getTotalRentalCost() + "\n";
        }
        return moviesRented;
    }

    public double getTotalOwed() {
        double totalOwed = 0;
        for (Rental rental : rentals) {
            totalOwed += rental.getTotalRentalCost();
        }
        return totalOwed;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
