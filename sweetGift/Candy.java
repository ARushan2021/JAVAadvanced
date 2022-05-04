package sweetGift;

public class Candy extends Gift {

    private String madeIn;

    public Candy(String name, int price, int weight, String madeIn) {
        super(name, price, weight);
        this.madeIn = madeIn;
    }
    public String getMadeIn() {return madeIn;}
    public void setMadeIn(String madeIn) {this.madeIn = madeIn;}

    public String toStringMadeIn() {
       return "madeIn : " + madeIn;
    }
}



