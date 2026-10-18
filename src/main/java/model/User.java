package model;

import java.util.Date;

public class User {
    
    private int id;
    private String name;
    private String lastName;
    private String email;
    private Date createdAt;
    private Date modificatedAt;

    public User(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
        return this.createdAt;
    }

    public void setModificatedAt(Date modificatedAt){
        this.modificatedAt = modificatedAt;
    }

    public Date getModificatedAt(){
        return this.modificatedAt;
    }
}
