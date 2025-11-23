package edu.ueh.final_android_app.models;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private final String caption;
    private final String driveFileId;          // URL tải từ Firebase Storage
    private final String authorId;
    private final String authorName;
    private final long createdAt;
    private String id;                // Firestore document id
    private List<String> likes;
    public Video(String id, String caption, String driveFileId, String authorId, String authorName, long createdAt, List<String> likes) {
        this.caption = caption;
        this.driveFileId = driveFileId;
        this.authorId = authorId;
        this.authorName = authorName;
        this.createdAt = createdAt;
        this.id = id;
        this.likes = likes;
    }

    public Video(String caption, String driveFileId, Account author, long createdAt, List<String> likes) {
        this.caption = caption;
        this.driveFileId = driveFileId;
        this.authorId = author.getId();
        this.authorName = author.getFullName();
        this.createdAt = createdAt;
        this.likes = likes;
    }

    public String getDriveFileId() {
        return driveFileId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getCaption() {
        return caption;
    }

    public int getTotalLike() {
        return likes.size();
    }

    public boolean isLiked(String userId) {
        return likes.stream().anyMatch(like -> like.equals(userId));
    }

    public List<String> getLikes() {
        return likes;
    }

    public void addLike(String newLike) {
        if (likes == null) {
            likes = new ArrayList<>();
        }
        likes.add(newLike);
    }
}
