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
    private List<Show> shows = new ArrayList<>();
}