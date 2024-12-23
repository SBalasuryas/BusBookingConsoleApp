package busrevs;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bookings {

	String Passanger;
	int Busno;
	Date Date;

	Bookings() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		Passanger = s.next();
		System.out.println("Enter BusNo : ");
		Busno = s.nextInt();
		System.out.println("Enter your Date (DD-MM-YYYY): ");
		String Dateobj = s.next();
		SimpleDateFormat formatdate = new SimpleDateFormat("dd-MM-yyyy");

		try {
			Date = formatdate.parse(Dateobj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public boolean isAvaliable(ArrayList<Bookings> bookbus, ArrayList<Bus> Buses){
			int capacity = 0;
			for(Bus bus:Buses) {
				if(bus.getBusno() == Busno)
					capacity = bus.getCapacity();
				}
			int booked = 0;
			for (Bookings b: bookbus) {
			if(b.Busno == Busno && b.Date.equals(Date)) {
			booked++;
			}
			}
			return booked< capacity ? true:false;
		}

}
