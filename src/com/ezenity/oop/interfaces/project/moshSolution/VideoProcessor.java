package com.ezenity.oop.interfaces.project.moshSolution;

public class VideoProcessor {
    private VideoEncoder videoEncoder;
    private VideoDatabase videoDatabase;
    private NotificationService notificationService;

    public VideoProcessor(VideoEncoder videoEncoder, VideoDatabase videoDatabase, NotificationService notificationService) {
        this.videoEncoder = videoEncoder;
        this.videoDatabase = videoDatabase;
        this.notificationService = notificationService;
    }

    public void process(Video video){
        /*
         * Create an interface here with different implementations
         */
//        var encoder = new XVideoEncoder();
//        encoder.encode(video);
        videoEncoder.encode(video);

        /*
         * Create an interface and how we can store different wys for a video,
         * for example SQL database or a Mongo database or use firebase.
         */
//        var database = new SqlVideoDatabase();
//        database.store(video);
        videoDatabase.store(video);

        /*
         * Create an interface for how we communicate with our users. This is using
         * an email service, but we can also send them a text or a push notification
         * to their mobile phone.
         */
//        var emailService = new EmailService();
//        emailService.sendEmail(video.getUser());
        notificationService.sendEmail(video.getUser());
    }
}
