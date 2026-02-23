public class DispensingState implements VendingMachineState {

    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Dispensing in progress...");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("Dispensing in progress...");
    }

    @Override
    public void dispenseItem() {
        String item = machine.getSelectedItem();
        machine.reduceItem(item);

        System.out.println("Dispensing: " + item);

        machine.resetBalance();
        machine.setState(machine.getIdleState());
    }

    @Override
    public void setOutOfOrder() {
        machine.setState(machine.getOutOfOrderState());
    }
}