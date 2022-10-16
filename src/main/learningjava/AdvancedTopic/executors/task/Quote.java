package main.learningjava.AdvancedTopic.executors.task;

public class Quote  {

    private final String site;
    private final double price;

    public Quote(String site, double price) {
        this.site = site;
        this.price = price;
    }

    public String getSite() {
        return site;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "site='" + site + '\'' +
                ", price=" + price +
                '}';
    }
}
