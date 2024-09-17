import java.time.LocalDateTime;


public abstract class Event implements Comparable<Event> {
    String name;
    LocalDateTime dateTime = LocalDateTime.now();

    public abstract String getName();

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {}

    public void setName(String name){
        this.name = name;
    }




}
