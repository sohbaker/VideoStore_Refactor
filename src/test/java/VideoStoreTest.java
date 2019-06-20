import org.junit.*;
import static org.junit.Assert.assertEquals;

public class VideoStoreTest {
    @Before
    public void setUp() {
        customer = new Customer("Fred");
    }

    @Test
    public void canCreateASingleNewReleaseStatement() {
        customer.addRental(new NewReleaseMovie("The Cell", 3));
        assertEquals("Rental Record for Fred\n\tThe Cell\t9.0\nYou owed 9.0\nYou earned 2 frequent renter points\n", customer.getRentalStatement());
    }

    @Test
    public void canCreateADualNewReleaseStatement() {
        customer.addRental(new NewReleaseMovie("The Cell", 3));
        customer.addRental(new NewReleaseMovie("The Tigger Movie",  3));
        assertEquals("Rental Record for Fred\n\tThe Cell\t9.0\n\tThe Tigger Movie\t9.0\nYou owed 18.0\nYou earned 4 frequent renter points\n", customer.getRentalStatement());
    }

    @Test
    public void canCreateASingleChildrensStatement() {
        customer.addRental(new ChildrensMovie("The Tigger Movie", 3));
        assertEquals("Rental Record for Fred\n\tThe Tigger Movie\t1.5\nYou owed 1.5\nYou earned 1 frequent renter points\n", customer.getRentalStatement());
    }

    @Test
    public void canCreateADualChildrensStatement() {
        customer.addRental(new ChildrensMovie("The Tigger Movie", 3));
        customer.addRental(new ChildrensMovie("Snow White", 3));
        assertEquals("Rental Record for Fred\n\tThe Tigger Movie\t1.5\n\tSnow White\t1.5\nYou owed 3.0\nYou earned 2 frequent renter points\n", customer.getRentalStatement());
    }

    @Test
    public void canCreateASingleRegularStatement() {
        customer.addRental(new RegularMovie("Plan 9 from Outer Space", 1));

        assertEquals("Rental Record for Fred\n\tPlan 9 from Outer Space\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n", customer.getRentalStatement());
    }

    @Test
    public void canCreateAMultipleRegularStatement() {
        customer.addRental(new RegularMovie("Plan 9 from Outer Space", 1));
        customer.addRental(new RegularMovie("8 1/2", 2));
        customer.addRental(new RegularMovie("Eraserhead", 3));

        assertEquals("Rental Record for Fred\n\tPlan 9 from Outer Space\t2.0\n\t8 1/2\t2.0\n\tEraserhead\t3.5\nYou owed 7.5\nYou earned 3 frequent renter points\n", customer.getRentalStatement());
    }

    private Customer customer;
}
