package com.example.ig_clone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseAppl extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        ParseObject.registerSubclass(Post.class);



        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("c1gyeQLbRhKzlwe9X4MMEeIUygF5fG54SnhEUiN8")
                .clientKey("7nVftIM9Q0jMpjxVuUYQpuK9yY9s15mycOceLaDj")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
