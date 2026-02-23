package VendingMachineProject;

public class ItemSelectedState implements VendingMachineState {

    private VendingMachine machine;
    private static final double PRICE = 10.0;

    public ItemSelectedState(VendingMachine machine){
        this.machine = machine;
    }

    public void selectItem(String item){
        System.out.println("Item already selected");
    }

    public void insertCoin(double amount){
        machine.addBalance(amount);
        System.out.println("Inserted: " + amount);

        if(machine.getBalance() >= PRICE){
            machine.setState(machine.getDispensingState());
            machine.dispenseItem();
        }
    }

    public void dispenseItem(){
        System.out.println("Insert enough coins");
    }

    public void setOutOfOrder(){
        machine.setState(machine.getOutOfOrderState());
    }
}
