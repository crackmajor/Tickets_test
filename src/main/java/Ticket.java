import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ticket {
    protected int id;
    protected int price;
    protected String departure;
    protected String arrival;
    protected int time;


}