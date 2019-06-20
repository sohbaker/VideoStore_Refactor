public class RegularMovie implements Rental {
    private String movieTitle;
    private int daysRented;

    public RegularMovie(String title, int daysRented) {
        this.movieTitle = title;
        this.daysRented = daysRented;
    }

    public String getTitle() {
        return movieTitle;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public int getFrequentRenterPoints() { return 1; }

    public double getTotalRentalCost() {
        double total = 2;
        if (daysRented > 2) {
            total += (daysRented - 2) * 1.5;
        }
        return total;
    }
}
