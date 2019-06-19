public class Statement {
    public void storeRecord(String customerName, RentalRecord rentalRecord) {
        this.name = customerName;
        this.rentalRecord = rentalRecord;
    }

    public String getStatement() {
        return String.format("Rental Record for %s\n%sYou owed %.1f\nYou earned %d frequent renter points\n",customerName(), moviesRented(), total(), frequentRenterPoints());
    }

    private String customerName() {
        return this.name;
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

    private String name;
    private RentalRecord rentalRecord;
}
