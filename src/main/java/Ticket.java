import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ticket implements Comparable<Ticket> {
    protected int id;
    protected int price;
    protected String departure;
    protected String arrival;
    protected int time;


    @Override
    public int compareTo(Ticket ticket2) {
        if (price > ticket2.price) {
            return 1;
        }
        if (price < ticket2.price) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        String x = String.valueOf((price));
        return x;
    }
}