package VendingMachineProject;

public class Main {

    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();

        vm.selectItem("Soda");
        vm.insertCoin(5);
        vm.insertCoin(5);
    }
}
