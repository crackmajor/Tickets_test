import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    Repository repository = new Repository();
    Manager manager = new Manager();
    Ticket ticket1 = new Ticket(1, 7000, "SPB", "MOSCOW", 120);
    Ticket ticket2 = new Ticket(2, 9000, "MOSCOW", "MOSCOW", 120);
    Ticket ticket3 = new Ticket(3, 99000, "ANAPA", "MOSCOW", 120);
    @Test
    void findAirDepTest(){
        repository.addTicket(ticket1);
        repository.addTicket(ticket2);
        repository.addTicket(ticket3);
        repository.getTickets();
        Ticket[] actual = manager.findDepAir("SPB");
        Ticket[] expected = {ticket1};
        assertArrayEquals(actual, expected);
    }

}