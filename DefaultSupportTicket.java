
public class DefaultSupportTicket implements SupportTicket {

    Priority priority;
    RequestType requestType;
    static int sequentialNumber = 1;

    public DefaultSupportTicket() {
        this.priority = priority;
        this.requestType = requestType;
        this.sequentialNumber = sequentialNumber;
    }

    {
        sequentialNumber++;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public int getSequentialNumber() {
        return sequentialNumber;
    }

    public RequestType getRequestType() {
        return this.requestType;
    }


    //method should return tickets and remove them from the HelpDesk in the next order:
    //Tickets with the higher priority goes first
    // In case two tickets have the same priority - the one that was created earlier should be returned

}
