package ru.skypro.homework.model;

import javax.persistence.*;

@Entity
public class Ads {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ad_creator")
    private User user;
    private String image;
    private Integer price;
    private String title;

    public User getUser () {
        return user;
    }

    public void setUser ( User user ) {
        this.user = user;
    }

    public String getImage () {
        return image;
    }

    public void setImage ( String image ) {
        this.image = image;
    }

    public Integer getId () {
        return id;
    }

    public void setId ( Integer pk ) {
        this.id = id;
    }

    public Integer getPrice () {
        return price;
    }

    public void setPrice ( Integer price ) {
        this.price = price;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }
}
