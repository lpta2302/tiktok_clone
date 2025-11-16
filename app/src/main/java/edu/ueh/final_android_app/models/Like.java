package edu.ueh.final_android_app.models;

public class Like {
    private int id;
    private int createdBy;

    public Like(int id, int createdBy){
        this.id = id;
        this.createdBy = createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getCreatedBy() {
        return createdBy;
    }
}
