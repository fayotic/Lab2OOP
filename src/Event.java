import java.util.Date;

public abstract class Event implements Comparable<Event> {
    String name;
    Date dateTime = new Date();

    public abstract String getName();

    public Date getDateTime() {
        return dateTime;
    }
    public void setDateTime(Date dateTime) {}

    public void setName(String name){
        this.name = name;
    }

    public int compareTo(Event e){
    }


}
