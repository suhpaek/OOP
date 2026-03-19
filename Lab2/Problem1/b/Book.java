package Problem1.b;

public class Book extends LibraryItem{
    private int numberOfPage;
    public Book(String title, String author, int year, int pages){
        super(title, author, year);
        this.numberOfPage = pages;
    }

    public int getPages(){
        return numberOfPage;
    }

    public void setPages(int numberOfPage){
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString(){
        return "Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", Publication Year: " + getYear() +
                ", Number of pages: " + getPages();
    }
}
