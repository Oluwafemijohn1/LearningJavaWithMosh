package main.learningjava.AdvancedTopic.stream;

public class Movie implements Comparable<Movie> {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public int compareTo(Movie o) {
        return 0;
    }

    @Override
    public String toString() {
        return title;
    }
}
