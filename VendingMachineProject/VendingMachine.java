package VendingMachineProject;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private VendingMachineState currentState;

    private VendingMachineState idleState;
    private VendingMachineState itemSelectedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfOrderState;

    private Map<String,Integer> inventory = new HashMap<>();
    private double balance = 0;
    private String selectedItem;

    public VendingMachine() {
        idleState = new IdleState(this);
        itemSelectedState = new ItemSelectedState(this);
        dispensingState = new DispensingState(this);
        outOfOrderState = new OutOfOrderState(this);

        currentState = idleState;

        inventory.put("Soda",5);
        inventory.put("Chips",3);
    }

    public void selectItem(String item){ currentState.selectItem(item); }
    public void insertCoin(double amount){ currentState.insertCoin(amount); }
    public void dispenseItem(){ currentState.dispenseItem(); }
    public void setOutOfOrder(){ currentState.setOutOfOrder(); }

    public void setState(VendingMachineState state){ this.currentState = state; }

    public VendingMachineState getIdleState(){ return idleState; }
    public VendingMachineState getItemSelectedState(){ return itemSelectedState; }
    public VendingMachineState getDispensingState(){ return dispensingState; }
    public VendingMachineState getOutOfOrderState(){ return outOfOrderState; }

    public boolean hasItem(String item){
        return inventory.getOrDefault(item,0) > 0;
    }

    public void reduceItem(String item){
        inventory.put(item, inventory.get(item)-1);
    }

    public void addBalance(double amount){ balance += amount; }
    public double getBalance(){ return balance; }
    public void resetBalance(){ balance = 0; }

    public void setSelectedItem(String item){ selectedItem = item; }
    public String getSelectedItem(){ return selectedItem; }
}