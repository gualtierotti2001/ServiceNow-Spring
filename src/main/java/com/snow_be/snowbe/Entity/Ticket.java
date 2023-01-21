package com.snow_be.snowbe.Entity;

import java.util.Date;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name="application_id", referencedColumnName = "application_id")
	private Application Application;
	@ManyToOne
	@JoinColumn(name="area_id", referencedColumnName = "area_id")
	private Area area;
	@ManyToOne
	@JoinColumn(name="resolution_group_id", referencedColumnName = "resolution_group_id")
	private ResolutionGroup ResolutionGroup;
	@ManyToOne
	@JoinColumn(name="user_id", referencedColumnName = "user_id")
	private User User;
	private String Serial_number;
	private Date creation_date;
	private String comments;
	private TicketStatus status;
	private String description;
	private String short_description;
	
	
	
	
	
	public enum TicketStatus {
		open, assigned,
		in_charge,
		suspended,
		closed,
		canceled;
    }	
}


