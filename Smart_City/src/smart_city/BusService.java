package smart_city;



import java.util.Arrays;
import java.util.List;

public class BusService implements TransportService {
    @Override
    public List<String> getSchedules() {
        return Arrays.asList("Bus A - 9:00 AM", "Bus B - 10:00 AM");
    }
}
