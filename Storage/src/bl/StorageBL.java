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
    
}
