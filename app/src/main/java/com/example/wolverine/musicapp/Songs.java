package com.example.wolverine.musicapp;

/**
 * Created by wolverine on 20/07/18.
 */

public class Songs {


    private String msongName;
    private String martistName;
    private final String mArtistDefaultName = "Un Known";

    public Songs(String msongName, String martistName) {
        this.msongName = msongName;
        this.martistName = martistName;
    }

    public Songs(String msongName) {
        this.msongName = msongName;
    }

    public String getMsongName() {
        return msongName;
    }

    public String getMartistName() {
        return martistName;
    }

}
