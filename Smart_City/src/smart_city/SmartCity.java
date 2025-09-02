package smart_city;





import java.util.*;
import java.util.stream.Collectors;

public class SmartCity {
    public static void main(String[] args) {
        TransportService bus = new BusService();
        TransportService metro = new MetroService();
        TransportService taxi = new TaxiService();

        List<TransportService> services = Arrays.asList(bus, metro, taxi);

        // 1. Lambda: Filter schedules containing "8"
        System.out.println("Schedules with '8':");
        services.stream()
                .flatMap(s -> s.getSchedules().stream())
                .filter(s -> s.contains("8"))
                .sorted()
                .forEach(System.out::println);

        // 2. Dashboard (forEach)
        System.out.println("\nLive Dashboard:");
        services.forEach(TransportService::printServiceDetails);

        // 3. Passengers (groupingBy, partitioningBy, summarizingDouble)
        List<Passenger> passengers = Arrays.asList(
                new Passenger("Amit", "Bus A"),
                new Passenger("Neha", "Metro X"),
                new Passenger("Raj", "Taxi 1"),
                new Passenger("Simran", "Bus B"),
                new Passenger("Riya", "Metro Y")
        );

        // groupingBy
        System.out.println("\nPassengers grouped by route:");
        Map<String, List<Passenger>> grouped = passengers.stream()
                .collect(Collectors.groupingBy(Passenger::getRoute));
        grouped.forEach((route, list) -> System.out.println(route + " -> " + list));

        // partitioningBy (peak vs non-peak: assume names starting with R = peak for demo)
        System.out.println("\nPartitioning by Peak vs Non-Peak:");
        Map<Boolean, List<Passenger>> partitioned = passengers.stream()
                .collect(Collectors.partitioningBy(p -> p.getName().startsWith("R")));
        partitioned.forEach((peak, list) -> System.out.println((peak ? "Peak:" : "Non-Peak:") + list));

        // summarizingDouble
        System.out.println("\nFare Summary:");
        List<Double> fares = Arrays.asList(20.0, 25.0, 30.0, 35.0, 100.0, 120.0);
        DoubleSummaryStatistics stats = fares.stream().collect(Collectors.summarizingDouble(f -> f));
        System.out.println("Total: " + stats.getSum() + " | Avg: " + stats.getAverage());

        // 4. Functional Interface with Lambda
        FareCalculator fareCalc = (distance, rate) -> distance * rate;
        double fare = fareCalc.calculateFare(10, 5); // 10 km × ₹5
        System.out.println("\nCalculated Fare (Lambda): ₹" + fare);

        // 5. Static method in interface
        double distance = GeoUtils.calculateDistance(0, 0, 3, 4);
        System.out.println("\nDistance (Static Method in Interface): " + distance);
    }
}
