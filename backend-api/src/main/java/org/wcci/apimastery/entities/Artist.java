package org.wcci.apimastery.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private long id;
    @OneToMany(mappedBy = "artist", orphanRemoval = true)
    private Collection<Album> albums;
    private String name;
    private String imagePath;
    private String dob;


    protected Artist() {

    }

    public Artist(String name, String imagePath, String dob) {
        this.name = name;
        this.imagePath = imagePath;
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public Collection<Album> getAlbums() {
        return albums;
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getDob() {
        return dob;
    }

}