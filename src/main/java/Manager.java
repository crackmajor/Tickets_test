import java.util.Arrays;

public class Manager {

    private Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public Ticket[] find(String departure, String arrival) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.getTickets()) {
            if (ticket.departure.contains(departure) && ticket.arrival.contains(arrival)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                int index = tmp.length - 1;
                tmp[index] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public void add(Ticket ticket) {
        repository.addTicket(ticket);
    }

    public void del(int id) {
        repository.delete(id);
    }

}
