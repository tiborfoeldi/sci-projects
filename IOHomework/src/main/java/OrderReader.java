import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class OrderReader {
    private Reader reader;

    public OrderReader(Reader reader) {
        this.reader = reader;
    }

    public List<Order> getOrders() throws IOException{
        try (BufferedReader br = new BufferedReader(reader)) {
            List<Order> orders = new ArrayList<Order>();
            String line = br.readLine();
            while (line != null) {
                orders.add(parseOrder(line));
                line = br.readLine();
            }
            return orders;
        }
    }

    private Order parseOrder(String line) {
        String[] tokens = line.split(",");
        return new Order(tokens[0], parseProduct(line), Integer.parseInt(tokens[2]), parseCustomer(line));
    }

    private Product parseProduct(String line) {
        String[] tokens = line.split(",");
        return new Product(tokens[1], Integer.parseInt(tokens[2]));
    }

    private Customer parseCustomer(String line) {
        String[] tokens = line.split(",");
        return new Customer(tokens[3]);
    }
}
