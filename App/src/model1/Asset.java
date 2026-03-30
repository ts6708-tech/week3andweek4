package model1;

public class Asset {
    public String name;
    public double returnRate;
    public double volatility;

    public Asset(String name, double returnRate, double volatility) {
        this.name = name;
        this.returnRate = returnRate;
        this.volatility = volatility;
    }

    @Override
    public String toString() {
        return name + ":" + returnRate;
    }
}