package com.nikischultz.concertapp.model;

import javax.persistence.*;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int artistId;

    @ManyToMany
    private String artistName;

    private String groupMembers;
    private int numberOfMembers;

    @ManyToMany
    private Genre genreName;

    private String merch;
    private String website;

    public Artist() {

    }

    public Artist(String artistName, String groupMembers, int numberOfMembers, Genre genreName, String merch, String website) {
        this.artistName = artistName;
        this.groupMembers = groupMembers;
        this.numberOfMembers = numberOfMembers;
        this.genreName = genreName;
        this.merch = merch;
        this.website = website;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(String groupMembers) {
        this.groupMembers = groupMembers;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public Genre getGenreName() {
        return genreName;
    }

    public void setGenreName(Genre genreName) {
        this.genreName = genreName;
    }

    public String getMerch() {
        return merch;
    }

    public void setMerch(String merch) {
        this.merch = merch;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
