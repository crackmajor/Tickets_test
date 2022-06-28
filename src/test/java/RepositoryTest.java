import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RepositoryTest {
    Repository repository = new Repository();
    Ticket ticket1 = new Ticket(1, 7000, "SPB", "MOSCOW", 120);
    Ticket ticket2 = new Ticket(2, 9000, "SPB", "MOSCOW", 120);
    Ticket ticket3 = new Ticket(3, 99000, "SPB", "MOSCOW", 120);
    Ticket ticket4 = new Ticket(4, 14000, "SPB", "MOSCOW", 120);
    Ticket ticket5 = new Ticket(5, 25000, "SPB", "MOSCOW", 120);

    @Test
    void shouldAddTicketTest() {
        repository.addTicket(ticket1);
        repository.addTicket(ticket2);
        repository.addTicket(ticket3);
        repository.addTicket(ticket4);
        repository.addTicket(ticket5);

        Ticket[] actual = repository.getTickets();
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5};

        assertArrayEquals(actual, expected);

    }

    @Test
    void shouldDeleteByID() {
        repository.addTicket(ticket1);
        repository.addTicket(ticket2);
        repository.addTicket(ticket3);
        repository.delete(2);
        Ticket[] actual = repository.getTickets();
        Ticket[] expected = {ticket1, ticket3};

        assertArrayEquals(actual, expected);
    }
}