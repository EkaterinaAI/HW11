public class Phone {
    static String country = "China";

    String number;
    String model;
    double weight;

    public Phone() {

    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String nameCaller){
        receiveCall(nameCaller, null);
    }

    public void receiveCall(String nameCaller, String numberCaller){
        System.out.println("Звонит абонент по имени " + nameCaller + (numberCaller == null ? "" : " номер: " + numberCaller));
    }
}
