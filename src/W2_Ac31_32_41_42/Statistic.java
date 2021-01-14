package W2_Ac31_32_41_42;

import static W2_Ac31_32_41_42.Ultis.convertMoney;

public class Statistic {
    private String maker;
    private int totalSold;
    private long totalMoney;

    public Statistic(String maker, int totalSold, long totalMoney) {
        this.maker = maker;
        this.totalSold = totalSold;
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Maker: "+maker+" | Total Sold: " + totalSold + " | Total Money: " + convertMoney(totalMoney)+"\n";
    }
}
