package com.example.khanhhuy.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yeu_thuong on 10/16/2017.
 */

public class Example {
    @SerializedName("title")
    @Expose
    private String mTitle;
    @SerializedName("body")
    @Expose
    private String mBody;
    @SerializedName("userId")
    @Expose
    private int mUserId;
    @SerializedName("id")
    @Expose
    private int mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public int getUserId() {
        return mUserId;
    }

    public void setUserId(int userId) {
        mUserId = userId;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    @Override
    public String toString() {
        return "Example{" +
                "title='" + mTitle + '\'' +
                ", body='" + mBody + '\'' +
                ", userId=" + mUserId +
                ", id=" + mId +
                '}';
    }
}
