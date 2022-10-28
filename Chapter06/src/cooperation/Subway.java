package cooperation;

public class Subway {
    String lineName;
    int passengerCount;
    int money;

    public Subway(String lineName) {
        this.lineName = lineName;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }
    public void showInfo() {
        System.out.println(lineName + "의 승객은 " + passengerCount +
                            "명이고, 수입은 " + money + "입니다.");
    }
}
