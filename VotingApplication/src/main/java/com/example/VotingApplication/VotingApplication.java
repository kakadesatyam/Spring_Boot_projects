package com.example.VotingApplication;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class VotingApplication {

	public static void main(String[] args) {
		// SpringApplication.run(VotingApplication.class, args);
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				"com.example.VotingApplication");
		
		AuthorityCounter authorityCounter = (AuthorityCounter)applicationContext.getBean("simpleauthoritycounter");

		while(true) {

		System.out.println("Welcome user");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose from below:\n1. I wanna Vote\n2. See All Votes(ADMIN)\n3.Exit");
		int userInput = scanner.nextInt();
		String beanID = "";
		
		switch (userInput) {
		case 1: {
			System.out.println("Enter your username:");
			scanner.nextLine();
			String userName = scanner.nextLine();
			User user = (User)applicationContext.getBean("user");
			user.setUserName(userName);
			
			System.out.println("Choose the party you wants to vote for:\n1. BJP\n2. Congress\n3.AAP\n4.ShivSena\n5.NCP");
			int userPartySelect = scanner.nextInt();
			
			switch(userPartySelect) {
			case 1:{
				beanID = "bjp";
				break;
			}
			case 2:{
				beanID = "Congress";
				break;
			}
			case 3:{
				beanID = "AAP";
				break;
			}
				case 4:{
					beanID = "ShivSena";
					break;
				}
				case 5:{
					beanID = "NCP";
					break;
				}
			}
			
			PoliticalParty politicalParty = (PoliticalParty)applicationContext.getBean(beanID);
			user.setPoliticalParty(politicalParty);
			UserList userList = (UserList) applicationContext.getBean("userlist");
			userList.addUser(user);
			System.out.println("Thank you");
			break;
		}
		case 2: {
			authorityCounter.getUserList().getUsersList().forEach(item->System.out.println(item.getUserName()+" is Voted For "+item.getPoliticalParty().getPartyName()));
			applicationContext.close();
			break;
		}

		}
		}
	}

}
