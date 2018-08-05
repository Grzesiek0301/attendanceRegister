import java.util.List;
import java.util.Scanner;

import dao.AttendanceDao;
import dao.ParticipantDao;
import model.Attendance;
import model.Participant;

public class MainClass {

	public static void main(String[] args) {
		
		AttendanceDao attendanceDao = new AttendanceDao();
		ParticipantDao participantDao = new ParticipantDao();
		
		List<Attendance> attendances = attendanceDao.loadAttendances();
		participantDao.loadParticipants();
		
		while (true) {
			System.out.println("What do you want to do ?");
			String builder = new StringBuilder().append("1.Show participants' list" + "\n")
					.append("2.Add new participant")
					.toString();

			System.out.println(builder);

			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();

			switch (number) {
			case 1:
				System.out.println(participantDao.getListOfParticipants());
				break;
			case 2:
				participantDao.addNewParticipant();
				break;
			default:
				break;
			}
		}
	}
}
