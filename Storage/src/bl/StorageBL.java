package bl;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class StorageBL extends AbstractTableModel{

    private ArrayList<Storage> storages = new ArrayList<>();
    private static String[] colNames = {"ID", "Description", "Amount", "Place"};
    
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
    
    public boolean checkPlace(int place){
        for (Storage storage : storages) {
            if(storage.getPlace() == place) return false;
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
    
    public void buy(int idx){
        storages.get(idx).buy();
        fireTableDataChanged();
    }
    
    public void sell(int idx) throws Exception{
        storages.get(idx).sell();
        fireTableDataChanged();
    }
    
}
