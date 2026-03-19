package Task2;

public class Song extends Media{
    String artist;

    @Override
    public void play() {
        System.out.println("Playing media \nArtist: " + artist );
    }
}
