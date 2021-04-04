package instruments;

public class Flute extends Instruments{

    private int holes;

    public Flute(InstrumentType instrumentType, double buyPrice, double sellPrice, String colour, int holes) {
        super(instrumentType, buyPrice, sellPrice, colour);
        this.holes = holes;
    }

    public int getHoles() {
        return holes;
    }

    public void setHoles(int holes) {
        this.holes = holes;
    }
}
