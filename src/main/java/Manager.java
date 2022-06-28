public class Manager {
    Repository repository = new Repository();
    public Ticket[] findDepAir(String departure){
        Ticket[] result = new Ticket[0];
        for (Ticket tickets:repository.getTickets()) {
            if (matches(tickets, departure)){
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i]=result[i];
                    int index = tmp.length - 1;
                    tmp[index]= tickets;
                    result=tmp;
                }
            }
        }
        return result;
    }

    public boolean matches(Ticket ticket,String search) {
        if (ticket.departure.contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
