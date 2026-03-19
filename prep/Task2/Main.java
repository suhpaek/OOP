package Task2;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector <Media> list = new Vector<>();
        Song s = new Song();
        s.artist = "Adele";

        Movie m = new Movie();
        m.duration=120;

        list.add(s);
        list.add(m);

        for(Media media : list) {
            media.play();

            if(media instanceof Song) {
                Song song = (Song) media;
                System.out.println(song.artist);
            }
        }
    }

}
