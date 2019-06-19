public class Regular implements RentalType {
    public Regular(String title, int daysRented) {
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
        double total = 2;
        if (getDaysRented() > 2) {
            total += (getDaysRented() - 2) * 1.5;
        }
        return total;
    }

    public String getType() { return this.type; }

    private String movieTitle;
    private int daysRented;
    private String type = "Regular";
    // public static final int PRICE_CODE = 0;
}
