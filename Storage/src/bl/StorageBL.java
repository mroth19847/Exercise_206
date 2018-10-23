package bl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class StorageBL extends AbstractTableModel{

    private ArrayList<Storage> storages = new ArrayList<>();
    private static String[] colNames = {"ID", "Description", "Amount", "Place"};
    
    
    public void load(File f) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        try {
            Object o;
            while ((o = ois.readObject()) != null) {
                storages.add((Storage) o);
            }
        } catch (EOFException eofExc) {
        }
        ois.close();
    }

    public void save(File f) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Storage s : storages) {
            oos.writeObject(s);
        }
        oos.flush();
        oos.close();
    }
    
    @Override
    public int getRowCount() {
        return storages.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return storages.get(rowIndex);
    }
    
    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
    public boolean checkPlace(int place){
        for (Storage storage : storages) {
            if(storage.getPlace() == place) return false;
        }
        return true;
    }
    
    public boolean checkID(int id){
        for (Storage storage : storages) {
            if(storage.getId() == id) return false;
        }
        return true;
    }
    
    public void add(Storage s){
        storages.add(s);
        fireTableDataChanged();
    }
    
    public void change(int idx, Storage s){
        storages.set(idx, s);
        fireTableDataChanged();
    }
    
    public void delete(int idx){
        storages.remove(idx);
        fireTableDataChanged();
    }
    
    public void buy(int idx, int am) throws Exception{
        storages.get(idx).buy(am);
        fireTableDataChanged();
    }
    
    public void sell(int idx, int am) throws Exception{
        storages.get(idx).sell(am);
        fireTableDataChanged();
    }
    
}
