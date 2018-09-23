public class Customer implements Comparable<Customer>{
    private String name;
    private Integer moneySpent = 0;
    private Integer nrOfOrders = 0;


    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getMoneySpent() {
        return moneySpent;
    }

    public Integer getNrOfOrders() {
        return nrOfOrders;
    }

    public void setNrOfOrders(Integer nrOfOrders) {
        this.nrOfOrders += nrOfOrders;
    }

    public void setMoneySpent(Integer moneySpent) {
        this.moneySpent = moneySpent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!name.equals(customer.name)) return false;
        if (!moneySpent.equals(customer.moneySpent)) return false;
        return nrOfOrders.equals(customer.nrOfOrders);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + moneySpent.hashCode();
        result = 31 * result + nrOfOrders.hashCode();
        return result;
    }

    @Override
    public int compareTo(Customer o) {
        int orders = ((Customer)o).getNrOfOrders();
        return orders - this.nrOfOrders;
    }
}
