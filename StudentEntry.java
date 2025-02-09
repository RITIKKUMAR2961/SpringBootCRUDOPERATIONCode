package com.RITIKKUMAR.Server_Side.CRUD.Operations.with.Spring.Boot.Entity;

public class StudentEntry {
    private Long id;
    private String fullName;
    private String section;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
