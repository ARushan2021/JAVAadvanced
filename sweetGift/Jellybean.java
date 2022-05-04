package sweetGift;

public class Jellybean extends Gift {
    private int articleNumber;

    public Jellybean(String name, int price, int weight, int articleNumber) {
        super(name, price, weight);
        this.articleNumber = articleNumber;
    }
    public int getArticleNumber() {return articleNumber;}
    public void setArticleNumber(int articleNumber) {this.articleNumber = articleNumber;}

    public String toStringArticleNumber() {
        return "Article number : " + articleNumber;
    }
}
