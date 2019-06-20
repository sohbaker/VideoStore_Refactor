public class Customer {
    private String name;
    private RentalRecord rentalRecord = new RentalRecord();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental singleRental) {
        rentalRecord.addRentalToRecord(singleRental);
    }

    public String getStatement() {
        Statement statement = new Statement(name, rentalRecord);
        return statement.getStatement();
    }
}