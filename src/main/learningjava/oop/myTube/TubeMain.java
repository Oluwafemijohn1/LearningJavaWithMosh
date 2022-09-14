package main.learningjava.oop.myTube;

public class TubeMain {
    static Double d1;
    static int x = d1.intValue();


    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var database = new SqlDatabase();
        var encoder = new XVideoEncoder();
        var emailService = new EmailService();
        var processor = new VideoProcessor( encoder, database, emailService);
        processor.process(video);
    }
}
