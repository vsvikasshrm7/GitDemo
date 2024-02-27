public class Cars {
    private int price;
    private int size;
    private int maxspeed;


    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "price=" + price +
                ", size=" + size +
                ", maxspeed=" + maxspeed +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Cars(int price, int size, int maxspeed) {
        this.price = price;
        this.size = size;
        this.maxspeed = maxspeed;
    }
}
