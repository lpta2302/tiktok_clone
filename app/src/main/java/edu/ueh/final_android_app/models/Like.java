package edu.ueh.final_android_app.models;

public class Like {
    private String id;
    private String createdBy;

    public Like(String id, String createdBy){
        this.id = id;
        this.createdBy = createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
}
