public class ChildrensMovie implements RentalType {
    public ChildrensMovie(String title, int daysRented) {
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
        double total = 1.5;
        if (getDaysRented() > 3) {
            total += (getDaysRented() - 3) * 1.5;
        }
        return total;
    }

    public String getType() { return this.TYPE; }

    private String movieTitle;
    private int daysRented;
    private static final String TYPE = "Childrens";
}
