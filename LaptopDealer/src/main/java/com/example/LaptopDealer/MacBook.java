package com.example.LaptopDealer;

public class MacBook implements LaptopBrand {

    Processor processors;
    public MacBook(Processor processors){
        this.processors=processors;
    }
    @Override
    public void showdetails() {
        System.out.println("You have selected MacBook Laptop"+processors.showProcessorDetails());
    }
}
