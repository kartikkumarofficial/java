package clg;

public class remove_all_occur {
    public static void main(String[] args) {
        String s = "The bookkeeper has a book about bookkeeping in his bookshop";
        String x = "book";
        String result = s.replace(x, "");
        System.out.println(result);
    }
}
