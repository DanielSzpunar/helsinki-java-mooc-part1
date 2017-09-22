public class Product {
    private String nameAtStart;
    private double price;
    private int amountAtStart;

    public Product(String nameAtStart, double price, int amountAtStart) {
        this.nameAtStart = nameAtStart;
        this.price = price;
        this.amountAtStart = amountAtStart;
    }
    public void printProduct() {
        System.out.println(this.nameAtStart + ", price " + this.price + ", amount " + this.amountAtStart );
    }
}
