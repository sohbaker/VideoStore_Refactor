public class NewRelease implements RentalType {
    public NewRelease(String title, int daysRented) {
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

    public String getType() { return this.type; }

    private String movieTitle;
    private int daysRented;
    private String type = "New Release";
    // public static final int PRICE_CODE = 1;
}
