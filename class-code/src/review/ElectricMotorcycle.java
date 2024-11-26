package review;

import java.util.Collection;
import java.util.Iterator;

public class ElectricMotorcycle extends Vehicle implements ElectricVehicle {

    private int currentBattery;


    public ElectricMotorcycle(int registrationNumber, double pricePerDay){
        super(registrationNumber,pricePerDay);
        this.currentBattery = 10;
    }



    public int getCurrentBattery(){
        return currentBattery;
    }

    public void setCurrentBattery(int currentBattery){
        this.currentBattery = currentBattery;
    }

    @Override
    public double calculateTotalPrice(int days) {
        return days * getPricePerDay();
    }


    @Override
    public void chargeCar(int charge) {
        if((charge + currentBattery) >=10){
            setCurrentBattery(10);
        }
        else{
            this.currentBattery +=charge;
        }
    }

    @Override
    public String getCarName() {
        return "";
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
