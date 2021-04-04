package nonInstruments;

public class SheetMusic extends NonInstruments {

    private String title;
    private int pages;

    public SheetMusic(String description, double buyPrice, double sellPrice, String title, int pages) {
        super(description, buyPrice, sellPrice);
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
