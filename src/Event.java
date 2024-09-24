import java.time.LocalDateTime;


public abstract class Event implements Comparable<Event> {
    String name; //Name of the event
    LocalDateTime dateTime; //Time and date the event starts

    //An abstract method that gets the name of the event
    public abstract String getName(String name);

    //Returns dateTime
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    //Sets the dateTime
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    //Sets the name of the event
    public void setName(String name){
        this.name = name;
    }

    //Compares the date of the event to the incoming event
    @Override
    public int compareTo(Event e){
        return dateTime.compareTo(e.getDateTime());
    }





}
