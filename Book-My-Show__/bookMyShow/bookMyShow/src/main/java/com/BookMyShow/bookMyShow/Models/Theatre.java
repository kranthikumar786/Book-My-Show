package com.BookMyShow.bookMyShow.Models;
@Getter
@Setter
@Entity
//@Table (name = "theatre")
public class Theatre extends BaseModel {
    private Stirng name ;
    private Stirng address;
    @OneToMany
    private List<Hall> halls = new ArrayList<>();
    @OneToMany
    // spring ORM will create table and relation b/w entities as well.
    private List<Show> shows = new ArrayList<>();
}