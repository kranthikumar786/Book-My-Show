package com.BookMyShow.bookMyShow.Models;
@Getter
@Setter
@Entity
public class Movie  extends BaseModel{

    private String name;
    private Double rating;
   @ElementCollectin
   @Enumerated
   // language is a collection of enumarates so using above @ElementCollection annotation
    private List<Language> languages = new ArrayList<>();
    @ElementCollectin
    @Enumerated
  private List<MovieFeature> features = new ArrayList<>();

}