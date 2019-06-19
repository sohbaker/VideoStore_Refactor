public class RegularMovie implements RentalType {
    public RegularMovie(String title, int daysRented) {
        this.movieTitle = title;
        this.daysRented = daysRented;
    }

    public String getTitle() {
        return this.movieTitle;
    }

    public String getType() { return this.TYPE; }

    public int getDaysRented() {
        return daysRented;
    }

    public double getTotalRentalCost() {
        double total = 2;
        if (getDaysRented() > 2) {
            total += (getDaysRented() - 2) * 1.5;
        }
        return total;
    }

    private String movieTitle;
    private int daysRented;
    private static final String TYPE = "Regular";
}
