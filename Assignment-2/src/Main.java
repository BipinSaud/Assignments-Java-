public class Main {
    public static void main(String[] args) {
        Author author1= new Author("Harry",1998);
        Author author2= new Author("Elon",1960);
        Author author3= new Author("Sundar",1970);


        Book book1=new Book("Potter",200,1978,author1);
        Book book2=new Book("Musk",300,1999,author2);
        Book book3=new Book("Pichai",500,2001,author3);


        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());


        System.out.println("Total Books = " + Book.total);
    }





}
