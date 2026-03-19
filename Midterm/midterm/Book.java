package midterm;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int availableCopies;

    public void taking() {
        if(availableCopies>0){
            System.out.println("Book " + title + " taked out");
            availableCopies--;
        }else{
            System.out.println("Sorry, we don't have copies");
        }
    }

    public void returning() {
        if(availableCopies>0){
            System.out.println("Book " + title + " returned");
            availableCopies++;
        }else{
            System.out.println("Sorry, we don't have copies");
        }
    }

}
