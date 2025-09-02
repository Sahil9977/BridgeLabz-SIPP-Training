package smart_city;



import java.util.List;

public interface TransportService {
    List<String> getSchedules();

    // Default method (Java 8)
    default void printServiceDetails() {
        getSchedules().forEach(System.out::println); // method reference
    }
}
