package org.snowpark.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="activity")
public class Activity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="activityid")
	private Long activityId;
	
	@Column(name="activitydesc", nullable=false)
	private String activityDesc;
	
	@Column(name="activitycharges", nullable=false)
	private Integer activityCharges;

	public Activity() {
		
	}

	public Activity(String activityDesc, Integer activityCharges) {
		super();
		this.activityDesc = activityDesc;
		this.activityCharges = activityCharges;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getActivityDesc() {
		return activityDesc;
	}

	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public Integer getActivityCharges() {
		return activityCharges;
	}

	public void setActivityCharges(Integer activityCharges) {
		this.activityCharges = activityCharges;
	}
	
}
