package com.example.LaptopDealer;

public class Microsoft implements LaptopBrand{
    Processor processors;
    public Microsoft(Processor processors){
        this.processors=processors;
    }
    @Override
    public void showdetails() {
        System.out.println("You have selected Microsoft Laptop"+processors.showProcessorDetails());
    }
}
