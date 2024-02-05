@Getter
@Setter
@Entity
public class Movie  extends BaseModel{

    private String name;
    private Double rating;
   @ElementCollectin
   @Enumerated
    private List<Language> languages = new ArrayList<>();
    @ElementCollectin
    @Enumerated
  private List<MovieFeature> features = new ArrayList<>();

}