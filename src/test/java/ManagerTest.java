import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    Repository repository = new Repository();
    Manager manager = new Manager(repository);
    Ticket ticket1 = new Ticket(1, 70200, "SPB", "MOSCOW", 120);
    Ticket ticket2 = new Ticket(2, 9000, "SPB", "MOSCOW", 120);
    Ticket ticket3 = new Ticket(3, 99000, "SPB", "MOSCOW", 120);
    Ticket ticket4 = new Ticket(4, 3200, "SPB", "PARGOLOVO", 5);

    @Test
    void deleteByIdTest() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.del(3);
        manager.del(2);
        Ticket[] actual = repository.getTickets();
        Ticket[] expected = {ticket1, ticket4};

        assertArrayEquals(actual, expected);
    }

    @Test
    void findTicketDepartureArrivalTest() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        System.out.println(Arrays.toString(manager.find("SPB","MOS")));

        Ticket[] actual = manager.find("SPB", "MOS");
        Ticket[] expected = {ticket2,ticket1,ticket3};

        assertArrayEquals(actual, expected);
    }

    @Test
    void mustAddTicket() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        Ticket[] actual = repository.getTickets();
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4};
        assertArrayEquals(actual, expected);
    }
}