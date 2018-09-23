import java.util.*;

public class ProductStatistics {

    private Map<String, Product> products = new HashMap<String, Product>();

    public Map<String, Product> getProducts() {
        return products;
    }

    public void addProducts(List<Order> orders) {
        for (Order order : orders) {
            if (products.containsKey(order.getProduct().getName())) {
                products.get(order.getProduct().getName()).setSoldPiecesCounter(1);
            } else {
                products.put(order.getProduct().getName(), order.getProduct());
            }
        }
    }


    public List<Product> getProductsByPiecesSold() {
        Collection<Product> productCollection = products.values();
        List<Product> productsList = new ArrayList<>(productCollection);
        Collections.sort(productsList);
        return productsList;
    }
}
