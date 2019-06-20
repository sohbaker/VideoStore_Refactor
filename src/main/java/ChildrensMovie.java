public class ChildrensMovie implements Rental {
    private String movieTitle;
    private int daysRented;

    public ChildrensMovie(String title, int daysRented) {
        this.movieTitle = title;
        this.daysRented = daysRented;
    }

    public String getTitle() {
        return movieTitle;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public int getFrequentRenterPoints() { return 1;}

    public double getTotalRentalCost() {
        double total = 1.5;
        if (daysRented > 3) {
            total += (daysRented - 3) * 1.5;
        }
        return total;
    }
}
