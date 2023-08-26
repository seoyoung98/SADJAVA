public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine.printVersion();

        // 생성자, 자판기를 메모리에 생성
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();
        // 만약 한 번 더 써준다면 인스턴스 2개가 생성된 것이다.

        String product1 = vm1.pushProductButton(1);
        System.out.println(product1);

        String product2 = vm2.pushProductButton(2);
        System.out.println(product2);
    }
}
