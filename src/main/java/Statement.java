import java.util.ArrayList;

public class Statement {
    private String name;
    private ArrayList<Rental> rentals = new ArrayList<>();

    public Statement(String customerName) {
        this.name = customerName;
    }

    public void add(Rental rental) {
        rentals.add(rental);
    }

    public String generate() {
        String moviesRented = getDetailsOfMoviesRented();
        double total = getTotalOwed();
        int frequentRenterPoints = getTotalFrequentRenterPoints();

        return String.format("Rental Record for %s\n%sYou owed %.1f\nYou earned %d frequent renter points\n",name, moviesRented, total, frequentRenterPoints);
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

    public int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
