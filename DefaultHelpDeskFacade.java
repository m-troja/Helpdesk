import java.util.*;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
    private static int ticketCounter = 0;
    private List<SupportTicket> tickets = new ArrayList<>();

    private void start() {

        //Check for new ticket
        if (getNextSupportTicket() != null) {
            tickets.add(getNextSupportTicket());


        }
    }

    public DefaultHelpDeskFacade() {

    };


    void addNewSupportTicket(SupportTicket supportTicket) {

    }

    private SupportTicket getNextSupportTicket() {
        if (ticketCounter < SupportTicket.getNumberOfTickets ) {

        }
    }

    int getNumberOfTickets();


}



}
