package sample;

import java.time.LocalDate;

/**
 * Created by VKurochkin on 10/28/2016.
 */
public class LocalEvent {

    private String description;
    private LocalDate date;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }
    
    public LocalEvent(LocalDate date, String description){
        this.setDate(date);
        this.setDescription(description);
    }

    @Override
    public String toString(){
        return "At: " + this.getDate() + " " + this.getDescription();
    }

}
