package review;

public abstract class Vehicle {

//    fields or attributes
    private int registrationNumber;
    private boolean isAvailable;
    private double pricePerDay;


    public Vehicle(int registrationNumber, double pricePerDay){
        this.registrationNumber = registrationNumber;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

//    getters

    public int getRegistrationNumber(){
        return registrationNumber;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public double getPricePerDay(){
        return pricePerDay;
    }

//    setters

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void setRegistrationNumber(int registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    public void setPricePerDay(double pricePerDay){
        this.pricePerDay = pricePerDay;
    }


    public abstract double calculateTotalPrice(int days);



}
