package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);


        Bus bus100 = new Bus(100);
        studentJames.takeBus(bus100);
        studentJames.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        studentTomas.showInfo();
        subwayGreen.showInfo();

        Student studentEdward = new Student("Edward", 30000);
        Taxi taxi = new Taxi("하치 운수");
        studentEdward.takeTaxi(taxi);
        studentEdward.showInfo();
        taxi.showInfo();
    }
}
