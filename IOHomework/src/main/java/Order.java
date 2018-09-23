public class Order {
    private String orderNo;
    private Product product;
    private Integer cost;
    private Customer customer;

    public Order(String orderNo, Product product, Integer cost, Customer customer) {
        this.orderNo = orderNo;
        this.product = product;
        this.cost = cost;
        this.customer = customer;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getCost() {
        return cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "orderNo='" + orderNo + '\'' +
                ", product=" + product +
                ", cost=" + cost +
                ", customer=" + customer +
                '}';
    }


}
