public class NewReleaseMovie implements RentalType {
    public NewReleaseMovie(String title, int daysRented) {
        this.movieTitle = title;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public String getTitle() {
        return this.movieTitle;
    }

    public double getTotalRentalCost() {
        return getDaysRented() * 3;
    }

    public String getType() { return this.TYPE; }

    private String movieTitle;
    private int daysRented;
    public static final String TYPE = "New Release";
}
