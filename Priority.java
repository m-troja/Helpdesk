public enum Priority {
    OTHER(RequestType.LOW()),
    CHANGE_ACCOUNT_DETAILS(RequestType.LOW()),
    CAN_NOT_LOGIN(RequestType.MEDIUM()),
    ACCOUNT_IS_BLOCKED(RequestType.MEDIUM()),
    COOPERATION(RequestType.MEDIUM()),
    ACCOUNT_IS_HACKED(RequestType.HIGH()),
    CAN_NOT_COMPLETE_PURCHASE(RequestType.HIGH());
}
