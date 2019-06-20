public class NewReleaseMovie implements Rental {
    private String movieTitle;
    private int daysRented;

    public NewReleaseMovie(String title, int daysRented) {
        this.movieTitle = title;
        this.daysRented = daysRented;
    }

    public String getTitle() {
        return movieTitle;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public int getFrequentRenterPoints() {
        if (daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }

   public double getTotalRentalCost() {
        return getDaysRented() * 3;
    }
}
