import java.util.*;

public class CustomerStatistics {

    private Map<String, Customer> customers = new HashMap<String, Customer>();

    public Map<String, Customer> getCustomers() {
        return customers;
    }

    public void addCustomers(List<Order> orders) {
        for (Order order : orders) {
            if (customers.containsKey(order.getCustomer().getName())) {
                customers.get(order.getCustomer().getName()).setNrOfOrders(1);
                customers.get(order.getCustomer().getName()).setMoneySpent(order.getCost());
            } else {
                customers.put(order.getCustomer().getName(), order.getCustomer());
                customers.get(order.getCustomer().getName()).setNrOfOrders(1);
                customers.get(order.getCustomer().getName()).setMoneySpent(order.getCost());
            }
        }
    }


    public List<Customer> getCustomerByNrOfOrders() {
        Collection<Customer> customerCollection = customers.values();
        List<Customer> customerList = new ArrayList<>(customerCollection);
        Collections.sort(customerList);
        return customerList;
    }

    public List<Customer> getCustomerByMostMoneySpent() {
        Collection<Customer> customerCollection = customers.values();
        List<Customer> customerList = new ArrayList<>(customerCollection);
        boolean swapped = true;
        Customer temp;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < customerList.size() - 1; i++) {
                if (customerList.get(i).getMoneySpent() < customerList.get(i + 1).getMoneySpent()) {
                    temp = customerList.get(i);
                    customerList.set(i, customerList.get(i + 1));
                    customerList.set(i + 1, temp);
                    swapped = true;
                }
            }
        }
        return customerList;
    }
}
