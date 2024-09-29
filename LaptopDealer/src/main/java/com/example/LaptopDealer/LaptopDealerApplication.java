package com.example.LaptopDealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class LaptopDealerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LaptopDealerApplication.class, args);
		System.out.println("satyam");
		ClassPathXmlApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner sc = new Scanner(System.in);




		boolean exit = false;  // Variable to control the loop
		while (!exit) {
			System.out.println("Choose the brand you wanna buy\n 1.Dell\n2.MacBook\n3.Microsoft\n4.Exit code");
			int userBrandSelect = sc.nextInt();
			if(!(userBrandSelect>=1&&userBrandSelect<=3)){
				System.out.println("Exit the code...");
				break;
			}
			System.out.println("Choose the processor you want:\n1.i3\n2.i5\n3.i7");
			int userProcessorSelect = sc.nextInt();
			String beanId = "";

			switch (userBrandSelect) {
				case 1: {
					// Dell
					switch (userProcessorSelect) {
						case 1: {
							beanId = "Dellwithi3";
							break;
						}
						case 2: {
							beanId = "Dellwithi5";
							break;
						}
						case 3: {
							beanId = "Dellwithi7";
							break;
						}
					}
					break;
				}
				case 2: {
					// MacBook
					switch (userProcessorSelect) {
						case 1: {
							beanId = "MacBookwithi3";
							break;
						}
						case 2: {
							beanId = "MacBookwithi5";
							break;
						}
						case 3: {
							beanId = "MacBookwithi7";
							break;
						}
					}
					break;
				}
				case 3: {
					// Microsoft
					switch (userProcessorSelect) {
						case 1: {
							beanId = "Microsofti3";
							break;
						}
						case 2: {
							beanId = "Microsofti5";
							break;
						}
						case 3: {
							beanId = "Microsofti7";
							break;
						}
					}
					break;
				}


				case 4:
					exit = true;  // Set exit to true to break out of the loop
					System.out.println("Exiting the program...");
					break;
				default:
					System.out.println("Invalid option, please try again.");
					continue;  // Go back to the beginning of the loop
			}

			if (!exit) {
				LaptopBrand brand=(LaptopBrand) ApplicationContext.getBean(beanId);
				brand.showdetails();
			}
		}
	}
}
