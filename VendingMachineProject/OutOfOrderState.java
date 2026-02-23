package VendingMachineProject;

public class OutOfOrderState implements VendingMachineState {

    private VendingMachine machine;

    public OutOfOrderState(VendingMachine machine){
        this.machine = machine;
    }

    public void selectItem(String item){
        System.out.println("Machine is out of order");
    }

    public void insertCoin(double amount){
        System.out.println("Machine is out of order");
    }

    public void dispenseItem(){
        System.out.println("Machine is out of order");
    }

    public void setOutOfOrder(){
        System.out.println("Already out of order");
    }
}