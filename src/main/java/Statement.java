public class Statement {
    private String name;
    private RentalRecord rentalRecord;

    public void accessRecord(String customerName, RentalRecord rentalRecord) {
        this.name = customerName;
        this.rentalRecord = rentalRecord;
    }

    public String getStatement() {
        return String.format("Rental Record for %s\n%sYou owed %.1f\nYou earned %d frequent renter points\n",customerName(), moviesRented(), total(), frequentRenterPoints());
    }

    private String customerName() {
        return name;
    }

    private String moviesRented() {
        return rentalRecord.getDetailsOfMoviesRented();
    }

    private double total() {
        return rentalRecord.getTotalOwed();
    }

    private int frequentRenterPoints() {
        return rentalRecord.getFrequentRenterPoints();
    }
}
