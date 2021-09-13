package com.example.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity(name = "Messages")
@Table(name = "messages")
public class Messages {

    @Id
    @SequenceGenerator(
            name = "message_id_seq",
            sequenceName = "message_id_seq",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "message_id_seq"
    )
    @Column(
            name = "id",
            updatable = false

    )


    private Long id;

    @Column(
            name="theme_id",
            updatable = false
    )
    private Integer themeId;

    @Column(
            name="user_id",
            updatable = false
    )
    private Integer userId;

    @Column(
            name="text",
            updatable = false,
            columnDefinition = "TEXT"
    )
    private String text;

    @Column(
            name="likes"
    )
    private Integer likes;

    @Column(
            name="dislikes"
    )
    private Integer dislikes;

    @Column(
            name="date_creation"
    )
    private Date dateCreation;

    public Messages(
                    Integer themeId,
                    Integer userId,
                    String text,
                    Integer likes,
                    Integer dislikes
                    ) {

        this.themeId = themeId;
        this.userId = userId;
        this.text = text;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public Messages() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}


