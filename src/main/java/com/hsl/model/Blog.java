package com.hsl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tittle;
    private String descriptionShort;
    private String description;
    private String author;
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Europe/Zagreb")
//    private LocalDateTime datePost;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date datePostNew;
    private Long categoryId;

//    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public Date getDatePostNew() {
        return datePostNew;
    }

    public void setDatePostNew(Date datePostNew) {
        this.datePostNew = datePostNew;
    }

    public Blog() {
    }

    public Blog(Long id, String tittle, String descriptionShort, String description, String author, Date datePostNew, Long categoryId, Category category) {
        this.id = id;
        this.tittle = tittle;
        this.descriptionShort = descriptionShort;
        this.description = description;
        this.author = author;
        this.datePostNew = datePostNew;
        this.categoryId = categoryId;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

//    public LocalDateTime getDatePost() {
//        return datePost;
//    }
//
//    public void setDatePost(LocalDateTime datePost) {
//        this.datePost = datePost;
//    }
}
