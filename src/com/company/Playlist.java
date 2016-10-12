package com.company;

import java.util.ArrayList;

/**
 * Created by Serkan on 11/10/16.
 */
public class Playlist {
    private String mName;
    private ArrayList<Song> mSongs;

    public Playlist (String playlist) {
        mName = playlist;
        mSongs = new ArrayList();
    }

    public String getName() {
        return mName;
    }

    public void addSong(Song song) {
        mSongs.add(song);
    }

    public void playAll() {
        for (int i = 0; i < mSongs.size(); i++) {
            mSongs.get(i).play();
        }

    }
}
