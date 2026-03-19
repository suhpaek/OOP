package Problem1.b;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getYear(){
        return publicationYear;
    }

    public void setYear(int year){
        this.publicationYear = year;
    }

    @Override
    public String toString(){
        return "Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", Publication Year: " + getYear();
    }



}
