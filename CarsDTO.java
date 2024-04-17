/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author LTC
 */
public class CarsDTO {
    private int CarID;
    private String CarName;
    private String Manufacturer;
    private double Price;
    private int ReleasedYear;

    public CarsDTO() {
        this.CarID=0;
        this.CarName="";
        this.Manufacturer="";
        this.Price=0.0;
        this.ReleasedYear=0;
    }
 
    public CarsDTO(int CarID, String CarName, String Manufacturer, double Price, int ReleasedYear) {
        this.CarID = CarID;
        this.CarName = CarName;
        this.Manufacturer = Manufacturer;
        this.Price = Price;
        this.ReleasedYear = ReleasedYear;
    }

    public int getCarID() {
        return CarID;
    }

    public void setCarID(int CarID) {
        this.CarID = CarID;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getReleasedYear() {
        return ReleasedYear;
    }

    public void setReleasedYear(int ReleasedYear) {
        this.ReleasedYear = ReleasedYear;
    }
    
    
    
    
}
