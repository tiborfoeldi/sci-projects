public class Product implements Comparable<Product> {
    private String name;
    private Integer price;
    private Integer soldPiecesCounter = 1;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getSoldPiecesCounter() {
        return soldPiecesCounter;
    }

    public void setSoldPiecesCounter(Integer soldPiecesCounter) {
        this.soldPiecesCounter += soldPiecesCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (soldPiecesCounter != product.soldPiecesCounter) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price;
        result = 31 * result + soldPiecesCounter;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", soldPiecesCounter=" + soldPiecesCounter +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        int piece = ((Product)o).getSoldPiecesCounter();
        return piece-this.soldPiecesCounter;
    }
}
