public class Customer {
    private String name;
    private Statement statement;

    public Customer(String name) {
        this.name = name;
        this.statement = new Statement(this.name);
    }

    public void addRental(Rental singleRental) {
        statement.add(singleRental);
    }

    public String getStatement() {
        return statement.generate();
    }
}