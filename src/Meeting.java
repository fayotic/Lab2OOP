import java.time.LocalDateTime;

public abstract class Meeting extends Event implements Completable {
    LocalDateTime endDateTime = LocalDateTime.now();
    String location;

    public void complete(){};

    public boolean isComplete(){
        return true;
    }

    public LocalDateTime getEndTime(){
        return endDateTime;
    }



}
