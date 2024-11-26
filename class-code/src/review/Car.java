package review;

public class Car extends Vehicle{

    private int numberOfSeats;

    public Car(int registrationNumber, double pricePerDay,int numberOfSeats){
        super(registrationNumber,pricePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateTotalPrice(int days) {
        return days * getPricePerDay() - 50;
    }

    public int getNumberOfSeats(){
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }
}
