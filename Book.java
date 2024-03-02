class Book {
    private String t;
    private int p;
    Book(String title, int page) {
        this.t = title;
        this.p = testPage(page);
    }
    String getTitle() {
        return this.t;
    }
    int getPage() {
        return this.p;
    }
    private int testPage(int pg) {
        if (pg > 0) return pg;
        else return -pg;
    }
}