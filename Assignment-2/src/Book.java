public class Book {
    String title;
    int pages;
    int publishedYear;

    Author author;

    static int total=0;

    public Book(String title, int pages,int publishedYear,Author author){
        this.title=title;
        this.pages=pages;
        this.publishedYear=publishedYear;
        this.author = author;
        //Increments number of boks by one on each object created
        total ++;

    }

    public String toString(){
        return title +" by "+ author.name +" (born in "+ author.birthYear+ ") " +pages + " Pages, published in "+ publishedYear;
    }
}

// Write a toString method that returns a String representation of a Book object.
// The format should be "Title by Author (born in BirthYear), Pages pages, published in PublishedYear".