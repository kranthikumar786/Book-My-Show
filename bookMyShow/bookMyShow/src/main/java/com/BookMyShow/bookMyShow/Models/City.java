@Getter
@Setter
@Entity
public class City extends BaseModel {
    private String name;
    @OneToMany
    private List<Theatre> theatres = new ArrayList<>();
}