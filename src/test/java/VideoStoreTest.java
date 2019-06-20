import org.junit.*;
import static org.junit.Assert.assertEquals;

public class VideoStoreTest {
    private ChildrensMovie childrensMovie;
    private NewReleaseMovie newReleaseOne;
    private NewReleaseMovie newReleaseTwo;
    private RegularMovie regularMovie;
    private Statement statement;
    private double DELTA = 0.0;

    @Before
    public void setUp() {
        statement = new Statement("Customer");
        childrensMovie = new ChildrensMovie("Children's", 1);
        newReleaseOne = new NewReleaseMovie("New Release 1", 1);
        newReleaseTwo = new NewReleaseMovie("New Release 2", 2);
        regularMovie = new RegularMovie("Regular", 3);
    }
    
    @Test
    public void calculatesTotalForAChildrensMovie() {
        statement.add(childrensMovie);
        assertEquals(statement.getTotalOwed(), 1.5, DELTA);
        assertEquals(statement.getTotalFrequentRenterPoints(), 1);
    }

    @Test
    public void calculatesTotalForARegularMovie() {
        statement.add(regularMovie);
        assertEquals(statement.getTotalOwed(), 3.5, DELTA);
        assertEquals(statement.getTotalFrequentRenterPoints(), 1);
    }

    @Test
    public void calculatesTotalForANewReleaseMovieRentedForOneDay() {
        statement.add(newReleaseOne);
        assertEquals(statement.getTotalOwed(), 3.0, DELTA);
        assertEquals(statement.getTotalFrequentRenterPoints(), 1);
    }

    @Test
    public void calculatesTotalForANewReleaseMovieRentedForMoreThanOneDay() {
        statement.add(newReleaseTwo);
        assertEquals(statement.getTotalOwed(), 6.0, DELTA);
        assertEquals(statement.getTotalFrequentRenterPoints(),2);
    }

    @Test
    public void generatesARentalStatement() {
        statement.add(newReleaseOne);
        statement.add(childrensMovie);
        statement.add(regularMovie);
        assertEquals("Rental Record for Customer\n"
                + "\tNew Release 1\t\t3.0\n"
                + "\tChildren's\t\t1.5\n"
                + "\tRegular\t\t3.5\n"
                + "You owed 8.0\n"
                + "You earned 3 frequent renter points\n", statement.generate());
    }
}
