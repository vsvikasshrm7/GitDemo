public class Cars {
    private int price;
    private int size;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "price=" + price +
                ", size=" + size +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Cars(int price, int size) {
        this.price = price;
        this.size = size;
    }
}
