import java.util.Comparator;

public class CustomSupportTicketsComparator implements Comparator<SupportTicket> {


public int compare(SupportTicket x, SupportTicket y) {
    if (  x.getSequentialNumber() > y.getSequentialNumber() ) {
        return 1;
    }
    else return 0;
}

}
