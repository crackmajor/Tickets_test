public class Repository {
    private Ticket[] tickets = new Ticket[0];

    public Ticket[] getTickets() {
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = ticket;
        tickets=tmp;
    }

    public void delete(int id){
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int index=0;
        for (Ticket ticket:tickets) {
            if (ticket.getId() != id){
                tmp[index]=ticket;
                index++;
            }
        }
        tickets = tmp;
    }
}
