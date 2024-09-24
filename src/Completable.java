public interface Completable {
    public void complete(); //Marks the event as complete
    public boolean isComplete(); //Returns true if the event is complete, otherwise false
}
