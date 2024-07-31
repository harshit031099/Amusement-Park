package org.snowpark.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="ticketbooking")
public class TicketBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ticketBookingId;
//	private Customer customers[]=new Customer[20];
//	private Activity activity[]=new Activity[20];
	private LocalDateTime dateTime;
	
	public TicketBooking() {
		
	}

	public Long getTicketBookingId() {
		return ticketBookingId;
	}

	public void setTicketBookingId(Long ticketBookingId) {
		this.ticketBookingId = ticketBookingId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
}
