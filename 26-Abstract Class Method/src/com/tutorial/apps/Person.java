package com.tutorial.apps;
public abstract class Person{
    private String name;
    private String id;

    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }
    public abstract void gaji(int gaji);

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }

    public void setName(String name){
        if(name != null){
            this.name = name;
        }
    }
    public void setId(String id){
        if(id != null){
            this.id = id;
        }
    }

}