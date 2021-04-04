package instruments;

public class Keyboard extends Instruments{

    private int keys;

    public Keyboard(InstrumentType instrumentType, double buyPrice, double sellPrice, String colour, int keys) {
        super(instrumentType, buyPrice, sellPrice, colour);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
}
