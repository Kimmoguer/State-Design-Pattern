package VendingMachineProject;

public class DispensingState implements VendingMachineState {

    private VendingMachine machine;

    public DispensingState(VendingMachine machine){
        this.machine = machine;
    }

    public void selectItem(String item){
        System.out.println("Dispensing in progress...");
    }

    public void insertCoin(double amount){
        System.out.println("Dispensing in progress...");
    }

    public void dispenseItem(){
        String item = machine.getSelectedItem();
        machine.reduceItem(item);
        System.out.println("Dispensing " + item);

        machine.resetBalance();
        machine.setState(machine.getIdleState());
    }

    public void setOutOfOrder(){
        machine.setState(machine.getOutOfOrderState());
    }
}
