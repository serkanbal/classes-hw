package com.company;

public class Main {

    public static void main(String[] args) {
        User userName = new User("Serkan");

        Song song0 = new Song("Song0", "Artist0", "Album0");
        Song song1 = new Song("Song1", "Artist1", "Album1");
        Song song2 = new Song("Song2", "Artist2", "Album2");
        Song song3 = new Song("Song3", "Artist3", "Album3");
        Song song4 = new Song("Song4", "Artist4", "Album4");

        Playlist playlist0 = new Playlist("Playlist0");
        playlist0.addSong(song0);
        playlist0.addSong(song1);

        Playlist playlist1 = new Playlist("Playlist1");
        playlist1.addSong(song2);
        playlist1.addSong(song3);
        playlist1.addSong(song4);

        userName.addPlaylist(playlist0);
        userName.addPlaylist(playlist1);

        System.out.println("All Playlist Names: " + userName.getAllPlaylists());
        System.out.println("Now Playing: " + playlist0.getName());
        playlist0.playAll();
        System.out.println("Now Playing " + playlist1.getName());
        playlist1.playAll();

    }
}
