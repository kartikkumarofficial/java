package others;

public class Constructor {
    public static class Book{
        String title;
        int pages;

        //0 arg constructor
        Book(){
            title="The Fault in our Stars";
            pages=300;
        }
        //1 arg constructor
        Book(String t){
            title=t;
            pages=200;
        }
        //2 arg constructor
        Book(String t , int p){
            title=t;
            pages=p;
        }

    }
    public static void main(String[] args) {
        Book b1= new Book();
        System.out.println(b1.title+", "+b1.pages);
        Book b2= new Book("Looking for Alaska");
        System.out.println(b2.title+", "+b2.pages);
        Book b3= new Book("Harry Potter", 300);
        System.out.println(b1.title+", "+b1.pages);





    }
}
