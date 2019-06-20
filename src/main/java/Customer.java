public class Customer {
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(RentalType singleRental) {
        rentalRecord.addRentalToRecord(singleRental);
    }

    public String getRentalStatement() {
        statement.accessRecord(name, rentalRecord);
        return statement.getStatement();
    }

    private String name;
    private Statement statement = new Statement();
    private RentalRecord rentalRecord = new RentalRecord();
}