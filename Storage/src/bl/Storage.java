
package bl;

import java.io.Serializable;

public class Storage implements Serializable{
    
    private int id;
    private String description;
    private int amount;
    private int place;

    public Storage(int id, String description, int place) {
        this.id = id;
        this.description = description;
        this.amount = 0;
        this.place = place;
    }

    public int getPlace() {
        return place;
    }

    public int getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
    public void buy() throws Exception{
        if(amount == 75) throw new Exception("Sie können im Moment nichts kaufen!");
        this.amount++;
    }
    
    public void sell() throws Exception{
        if(amount == 0) throw new Exception("Sie können im Moment nicht verkaufen!");
        this.amount--;
    }
}
