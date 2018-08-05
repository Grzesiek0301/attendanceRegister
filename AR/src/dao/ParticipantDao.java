package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import model.Participant;

public class ParticipantDao {
	
	List<Participant> listOfParticipants = new ArrayList<>();

	public void loadParticipants() {
		
		String filePath = "/home/grzesiek/git/AR/AR/participants.csv";
		BufferedReader bufferedReader = null;
		String line = "";
		String csvSplitBy = ",";
	
		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			while((line = bufferedReader.readLine()) != null) {
				String[] participantData = line.split(csvSplitBy);
				
				Participant participant = new Participant();
				participant.setParticipantId(Integer.parseInt(participantData[0]));
				participant.setFirstName(participantData[1]);
				participant.setLastName(participantData[2]);
				participant.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(participantData[3]));
				participant.setPhoneNumber(Integer.parseInt(participantData[4]));
				listOfParticipants.add(participant);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public void addNewParticipant() {
		Participant participant = new Participant();
		participant.setParticipantId(generateParticipantId());
		getMessage("Enter first name");
		participant.setFirstName(stringWriter());
		getMessage("Enter last name");
		participant.setLastName(stringWriter());
		getMessage("Enter birth date");
		participant.setBirthDate(setDate());
		getMessage("Enter phone number");
		participant.setPhoneNumber(numberWritier());
		
		listOfParticipants.add(participant);
	}
	
	private Date setDate() {
		getMessage("Enter day of birth");
		int day = numberWritier();
		getMessage("Enter mount of birth");
		int mount = numberWritier();
		getMessage("Enter year of birth");
		int year = numberWritier();
		
		return new GregorianCalendar(year,mount, day).getTime();
	}

	public void getMessage(String message) {
		System.out.println(message);
	}
	
	public int generateParticipantId() {
		return listOfParticipants.get(listOfParticipants.size()-1).getParticipantId() + 1;
	}
	
	public String stringWriter() {
		Scanner scanner = new Scanner(System.in);
		
		return scanner.nextLine();
	}
	
	public int numberWritier() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public List<Participant> getListOfParticipants() {
		return listOfParticipants;
	}

	public void setListOfParticipants(List<Participant> listOfParticipants) {
		this.listOfParticipants = listOfParticipants;
	}
}
