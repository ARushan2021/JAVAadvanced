package sweetGift;

public abstract class Gift {
    private String name;
    private int price;
    private int weight;
    private String uniqueParameter;

    public Gift(String name, int price, int weight, String uniqueParameter) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.uniqueParameter = uniqueParameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }

    public void setUniqueParameter(String uniqueParameter) {
        this.uniqueParameter = uniqueParameter;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Price = " + price + ", Weight = " + weight + ", Unique parameter = " + uniqueParameter;
    }
}

