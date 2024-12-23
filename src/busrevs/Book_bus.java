 package busrevs;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
 
public class Book_bus {

	public static void main(String[] args) {
		
		// al for the store bus
		ArrayList<Bus> Buses = new ArrayList<Bus>();
		
		ArrayList<Bookings> bookbus  = new ArrayList<Bookings>();
		
		
		
		Buses.add(new Bus(1,true,2));
		Buses.add(new Bus(2,false,43));
		Buses.add(new Bus(3,true,50));
		Buses.add(new Bus(4,false,70));
			
		
		for(Bus i:Buses) {
			i.displayBusinfo();
		}
		
		
		//user input
		Scanner s = new Scanner(System.in);
		int useropt = 1;
		while(useropt==1){

			System.out.println(" Enter 1 to Book \n Enter 2 to exit");
			useropt = s.nextInt();
			if(useropt ==1) {
				System.out.println("Booking Started");
				Bookings booking = new Bookings();
				if(booking.isAvaliable(bookbus, Buses) == true) {
					bookbus.add(booking);
					System.out.println("your Booking is Sucess");
				}
				else {
					System.out.println("Sorry, Bus is full try another Bus or Day.");
				}
				
			}
			

		}
		while(useropt!=1) {
			System.out.println(" Sorry, For the inconvience............ ");
			
		}
	}

}
