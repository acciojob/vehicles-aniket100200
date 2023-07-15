package com.driver;

public class Boat implements WaterVehicle
{
    private String name;
    private int capcity;
    public Boat()
    {

    }
    public Boat(String name,int capcity)
    {
        this.name=name;
        this.capcity=capcity;
    }
    public String getVehicleName(){
        return this.name;
    }

    public int getVehicleCapacity()
    {
        return this.capcity;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCapcity(int capcity) {
        this.capcity = capcity;
    }
}