package ru.skypro.homework.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
public class AdsComment {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer author;
    private OffsetDateTime createdAt;
    private String text;

    public Integer getAuthor () {
        return author;
    }

    public void setAuthor ( Integer author ) {
        this.author = author;
    }

    public OffsetDateTime getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt ( OffsetDateTime createdAt ) {
        this.createdAt = createdAt;
    }

    public Integer getId () {
        return id;
    }

    public void setId ( Integer pk ) {
        this.id = id;
    }

    public String getText () {
        return text;
    }

    public void setText ( String text ) {
        this.text = text;
    }
}
