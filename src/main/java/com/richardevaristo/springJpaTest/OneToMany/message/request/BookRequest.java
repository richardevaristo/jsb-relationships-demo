package com.richardevaristo.springJpaTest.OneToMany.message.request;

public class BookRequest {

    private String title;
    private String description;
    private String name;

    public BookRequest(String title, String description, String name) {
        this.title = title;
        this.description = description;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
