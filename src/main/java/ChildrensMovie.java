public class ChildrensMovie implements RentalType {
    public ChildrensMovie(String title, int daysRented) {
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
        double total = 1.5;
        if (getDaysRented() > 3) {
            total += (getDaysRented() - 3) * 1.5;
        }
        return total;
    }

    private String movieTitle;
    private int daysRented;
    private static final String TYPE = "Childrens";
}
