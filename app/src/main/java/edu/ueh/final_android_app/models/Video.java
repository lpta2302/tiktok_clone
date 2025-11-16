package edu.ueh.final_android_app.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Video {
    private int id;
    private String caption;

    private int videoUrl;

    private Account author;

    private List<Like> likes;

    public Video (int id, String caption, int videoUrl, Account author, List<Like> likes) {
        this.id = id;
        this.caption = caption;
        this.videoUrl = videoUrl;
        this.author = author;
        this.likes = Objects.requireNonNullElseGet(likes, ArrayList::new);
    }

    public int getId() {
        return id;
    }

    public int getVideoUrl(){
        return videoUrl;
    }

    public String getAuthorName() {
        return author.getFullName();
    }

    public String getCaption() {
        return caption;
    }

    public int getTotalLike() {
        return likes.size();
    }

    public boolean isLiked(int userId){
        return likes.stream().anyMatch(like -> like.getCreatedBy() == userId);
    }

    public void addLike(Like newLike){
        if (likes == null){
            likes = new ArrayList<>();
        }
        likes.add(newLike);
    }
}
