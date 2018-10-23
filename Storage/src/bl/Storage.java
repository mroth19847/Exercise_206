
package bl;

public class Storage {
    
    private int id;
    private String description;
    private int amount;
    private int place;

    public Storage(int id, String description, int place) {
        this.id = id;
        this.description = description;
        this.amount = amount;
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
    
   
}
