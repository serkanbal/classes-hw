package com.company;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by Serkan on 11/10/16.
 */
public class User {
    private String mName;
    private HashMap <String, Playlist> mPlaylists;

    public User(String name) {
        mName = name;
        mPlaylists = new HashMap<>();
    }

    public void addPlaylist(Playlist playlist) {
        mPlaylists.put(playlist.getName(), playlist);
    }

    public Collection<String> getAllPlaylists() {
        return mPlaylists.keySet();
    }

    public Playlist getPlaylistByName(String name) {
        if(mPlaylists.containsKey(name)) {
            return mPlaylists.get(name);
        } else {
            return null;
        }
    }
}
