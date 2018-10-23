package bl;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class StorageCellRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Storage s = (Storage) value;
        JLabel label = new JLabel();
        switch(column){
            case 0: label.setText(""+s.getId()); break;
            case 1: label.setText(s.getDescription()); break;
            case 2: label.setText(""+s.getAmount()); break;
            case 3: label.setText(""+s.getPlace()); break;
        }
        label.setOpaque(true);
        if(s.getAmount()==0) label.setBackground(Color.red);
        if(isSelected) label.setBackground(Color.darkGray);
        
        return label;
    }
    
}
