package com.BookMyShow.bookMyShow.Models;
@Getter
@Setter
@Entiy
public class Hall extends BaseModel{
private String name ;
@ManyToOne
private List<Seat> seats = new ArrayList<>();

@ElementCollection
// MovieFeatures are list of enumartes so above annotation.
@Enumerated
private List<MovieFeature> features = new ArrayList<>();
}