package SuperMarket;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public Merchandise[] merchandises;
    public int[] merchandiseSold;

}
