package smart_city;



import java.util.Arrays;
import java.util.List;

public class MetroService implements TransportService {
    @Override
    public List<String> getSchedules() {
        return Arrays.asList("Metro X - 8:30 AM", "Metro Y - 9:30 AM");
    }
}
