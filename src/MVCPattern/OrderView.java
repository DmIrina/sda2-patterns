package MVCPattern;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ListIterator;

public class OrderView extends JPanel implements Observer, ActionListener {
    // Controller
    private OrderController controller;
    // User-Interface Elements
    private JFrame frame;
    private JButton changePriceButton;
    private JButton deleteItemButton;
    private JTextField newPriceField;
    private JLabel totalLabel;
    private JTable groceryList;
    private void createUI() {
// Initialize UI elements. e.g.:
        deleteItemButton = new JButton("Delete Item");
        add(deleteItemButton);
// ...
// Add listeners. e.g.:
        deleteItemButton.addActionListener(this);
// ...
    }

    public void update ( Observable s, Object arg ) {
        display(((StoreOrder) s).getItemList(), ((StoreOrder) s).getPriceList());
    }
    public OrderView(OrderController controller) {
        this.controller = controller;
        createUI();
    }

    public void display (ListIterator<String> itemList, ListIterator<BigDecimal> priceList ) {
// code to display order
// ...
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == deleteItemButton) {
            controller.deleteItem(groceryList.getSelectedRow());
        }
        else if (event.getSource() == changePriceButton) {
            BigDecimal newPrice = new BigDecimal(newPriceField.getText());
            controller.changePrice(groceryList.getSelectedRow(), newPrice);
        }
    }
}
