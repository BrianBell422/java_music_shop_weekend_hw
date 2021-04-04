package instruments;

public abstract class Instruments {

    private InstrumentType instrumentType;
    private double buyPrice;
    private double sellPrice;
    private String colour;

    public Instruments(InstrumentType instrumentType, double buyPrice, double sellPrice, String colour) {
        this.instrumentType = instrumentType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.colour = colour;
    }


    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
