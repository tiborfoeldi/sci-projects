import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        File file = new File("sales.csv");
        Path path = file.toPath();

        FileReader fr = new FileReader(file);
        List<Order> orders = new OrderReader(fr).getOrders();


        ProductStatistics prodStats = new ProductStatistics();
        prodStats.addProducts(orders);
        prodStats.getProductsByPiecesSold();
        CustomerStatistics custStats = new CustomerStatistics();
        custStats.addCustomers(orders);
        custStats.getCustomerByNrOfOrders();

        ProductStatExporter exporter = new ProductStatExporter();
        exporter.writeStatsToFile(prodStats,custStats);
    }
}



