package com.ezenity.oop.interfaces.project;

public class VideoProcessor {
    public void process(Video video){
        /*
         * Create an interface here with different implementations
         */
        var encoder = new VideoEncoder();
        encoder.encode(video);

        /*
         * Create an interface and how we can store different wys for a video,
         * for example SQL database or a Mongo database or use firebase.
         */
        var database = new VideoDatabase();
        database.store(video);

        /*
         * Create an interface for how we communicate with our users. This is using
         * an email service, but we can also send them a text or a push notification
         * to their mobile phone.
         */
        var emailService = new EmailService();
        emailService.sendEmail(video.getUser());
    }
}
