public class Book {
    private String name;
    private String author;
    public String getBookName()
    {
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    Book(String name, String author){
        this.author=author;
        this.name=name;
    }

}