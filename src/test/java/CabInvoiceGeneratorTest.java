import com.CabInvoiceGenerator.BridgeLabz.CabInvoiceGenerator;
import com.CabInvoiceGenerator.BridgeLabz.Ride;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class CabInvoiceGeneratorTest
{
    CabInvoiceGenerator CIG = new CabInvoiceGenerator();

    @Test

    public void DistanceandTimeShouldReturnTotalFare()
    {
        double distance = 2.0;
        int time = 5;
        double fare = CIG.Fare(distance, time);
        Assertions.assertEquals(25.0, fare);
    }

    @Test

    public void givenMultipleRidees_ShouldReturnTotalFare(){
        Ride[] rides = {new Ride(2.0,5),
                new Ride(0.1,1)};
        double fare = CIG.multipleRide(rides);
        Assertions.assertEquals(30.0,fare);
}
}
