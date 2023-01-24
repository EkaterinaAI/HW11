public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+79205632145", "Samsung", 250);
        phone.receiveCall("Sveta", "+79802547856");

        Phone phone1 = new Phone();
        phone1.receiveCall("Kate");
    }
}
