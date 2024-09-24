import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Meeting extends Event implements Completable {
    LocalDateTime endDateTime;
    String location;
    boolean complete;

    //Constructor
    Meeting(String name, LocalDateTime endDateTime, String location, boolean complete) {
        setName(name);
        setDateTime(endDateTime);
        setLocation(location);
        this.complete = complete;
    }

    //sets complete to true
    public void complete(){
        complete = true;
    }

    //returns complete
    public boolean isComplete(){
        return this.complete;
    }

    //returns endDateTime
    public LocalDateTime getEndTime(){
        return this.endDateTime;
    }

    //returns the duration
    public Duration getDuration(){
        return Duration.between(getDateTime(), endDateTime);
    }

    //returns the location
    public String getLocation(){
        return this.location;
    }

    //sets the endDateTime
    public void setEndTime(LocalDateTime endDateTime){
        this.endDateTime = endDateTime;
    }

    //sets the location
    public void setLocation(String location)
    {
        this.location = location;
    }



}
