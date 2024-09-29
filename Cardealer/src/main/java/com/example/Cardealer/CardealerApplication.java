package com.example.Cardealer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class CardealerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner sc = new Scanner(System.in);

		boolean exit = false;  // Variable to control the loop
		while (!exit) {
			System.out.println("Choose the car you want to buy:\n 1. Family Car\n 2. Sports Car\n 3. Cyber Truck Car\n 4. Exit");
			int userselect = sc.nextInt();
			String beanId = "";

			switch (userselect) {
				case 1:
					beanId = "family";
					break;
				case 2:
					beanId = "sports";
					break;
				case 3:
					beanId = "CyberTruckCar";
					break;
				case 4:
					exit = true;  // Set exit to true to break out of the loop
					System.out.println("Exiting the program...");
					break;
				default:
					System.out.println("Invalid option, please try again.");
					continue;  // Go back to the beginning of the loop
			}

			if (!exit) {
				Car car = (Car) context.getBean(beanId);
				car.ShowcarDetails();
			}
		}
		context.close();  // Close the context once the loop exits
		sc.close();  // Close the scanner
	}
}
