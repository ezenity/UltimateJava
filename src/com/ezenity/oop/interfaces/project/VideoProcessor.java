package com.ezenity.oop.interfaces.project;

public class VideoProcessor
        implements VideoEncoder, VideoDatabase, EmailService {

    public void process(Video video){
        /*
         * Create an interface here with different implementations
         */
//        var encoder = new VideoEncoder();
//        encoder.encode(video);
        encode(video);

        /*
         * Create an interface and how we can store different wys for a video,
         * for example SQL database or a Mongo database or use firebase.
         */
//        var database = new VideoDatabase();
//        database.store(video);
        store(video);

        /*
         * Create an interface for how we communicate with our users. This is using
         * an email service, but we can also send them a text or a push notification
         * to their mobile phone.
         */
//        var emailService = new EmailService();
//        emailService.sendEmail(video.getUser());
        sendEmail(video.getUser());
    }

    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }

    @Override
    public void store(Video video) {
        System.out.println("Storing video metadata in a SQL database...");
        System.out.println("Title: " + video.getTitle());
        System.out.println("File Name: " + video.getFileName());
        System.out.println("Done!\n");
    }

    @Override
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
