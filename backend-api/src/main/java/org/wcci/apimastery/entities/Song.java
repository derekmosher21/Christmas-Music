package org.wcci.apimastery.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private long id;
    private String songName;
    @JsonIgnore
    @ManyToOne
    private Album songAlbum;
    private String songUrl;
    private String songLength;


    public Song(String songLength, String songName, Album songAlbum, String songUrl) {
        this.songLength = songLength;
        this.songName = songName;
        this.songAlbum = songAlbum;
        this.songUrl = songUrl;
    }

    protected Song() {
    }

    public String getSongLength() {
        return songLength;
    }

    public Long getId() {
        return id;
    }

    public String getSongName() {
        return songName;
    }

    public Album getSongAlbum() {
        return songAlbum;
    }

    public String getSongUrl() {
        return songUrl;
    }
}
