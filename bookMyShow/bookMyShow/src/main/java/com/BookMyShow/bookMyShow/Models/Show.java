@Getter
@Setter
@Entity
public class Show extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    private  Date startTime;
    private Integer duration;

    @ManyToOne
    @JoinColumn (name = "theatre_id")
    private Theatre theatre;
   private List<ShowSeat> showSeats = new ArrayList<>();
}