package com.example.LaptopDealer;

public class Dell implements LaptopBrand
{
    Processor processors;
    public Dell(Processor processors){
        this.processors=processors;
    }
    @Override
    public void showdetails() {
        System.out.println("You have selected Dell Laptop"+processors.showProcessorDetails());
    }
}
