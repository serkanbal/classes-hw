package com.company;

/**
 * Created by Serkan on 11/10/16.
 */
public class Song {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song (String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play() {
        System.out.println("The song " + mSongName + " from " +mArtistName + " in album " + mAlbumName);
    }

}
