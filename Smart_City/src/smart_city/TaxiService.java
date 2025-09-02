package smart_city;

import java.util.Arrays;
import java.util.List;

public class TaxiService implements TransportService {
    @Override
    public List<String> getSchedules() {
        return Arrays.asList("Taxi 1 - 8:15 AM", "Taxi 2 - 8:45 AM");
    }
}
