import java.time.LocalDateTime;

public abstract class Deadline extends Event implements Completable{

    private boolean complete; //Represents whether the task is complete

    //Constructor
    public Deadline(String name, LocalDateTime datetime){
        setName(name); //sets name through Event
        setDateTime(datetime); //sets dateTime through Event
        this.complete = false; // default
    }

    @Override
    public void complete() {
        this.complete = true; //set complete to true
    }
    @Override
    public boolean isComplete() {
        return complete; //returns complete
    }


}
