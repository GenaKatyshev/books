public class Main {
    public static void main(String[] args) {
        Book a = new Book("The Way", -50);
        Book b = new Book("My apartment", -50);
        System.out.println(a.getTitle());
        System.out.println(a.getPage());
        System.out.println(b.getTitle());
        System.out.println(b.getPage());
        b.setPage(1000);
        System.out.println(b.getTitle());
        System.out.println(b.getPage());
    }
}