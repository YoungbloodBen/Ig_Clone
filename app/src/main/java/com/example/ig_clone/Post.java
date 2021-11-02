package com.example.ig_clone;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;


@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String Key_IMAGE = "image";
    public static final String KEY_USER = "User";

    public String getDescription() {
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description){
        put(KEY_DESCRIPTION,description);

    }

    private void put(String keyDescription, String description) {
    }

    public ParseFile getImage(){
        return getParseFile(Key_IMAGE);

    }



    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }
    public void setUser(ParseUser user){

        put(KEY_USER, user);
    }

    public void SetImage(ParseFile parseFile) {
        put(Key_IMAGE,parseFile);
    }
}
