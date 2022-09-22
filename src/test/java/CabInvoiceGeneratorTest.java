import com.CabInvoiceGenerator.BridgeLabz.CabInvoiceGenerator;
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
        Assertions.assertEquals(25.0, fare, 0.0);
    }
}
