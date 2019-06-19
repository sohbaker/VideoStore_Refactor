import java.util.*;

public class RentalRecord {
    public void addRentalToRecord(RentalType singleRental) {
        rentals.add(singleRental);
    }

    public String getDetailsOfMoviesRented() {
        String moviesRented = "";
        for (RentalType singleRental : rentals) {
            moviesRented += "\t" + singleRental.getTitle() + "\t"
                    + singleRental.getTotalRentalCost() + "\n";
        }
        return moviesRented;
    }

    public double getTotalOwed() {
        double totalOwed = 0;
        for (RentalType singleRental : rentals) {
            totalOwed += singleRental.getTotalRentalCost();
        }
        return totalOwed;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (RentalType singleRental : rentals) {
            frequentRenterPoints++;
            if (singleRental.getType() == NewReleaseMovie.TYPE && singleRental.getDaysRented() > 1) frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private ArrayList<RentalType> rentals = new ArrayList<>();
}
