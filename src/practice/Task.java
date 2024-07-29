package practice;

import java.time.LocalDate;

public class Task {
	//
	private LocalDate date;
	private String str;
	
	public Task(LocalDate date, String str) {
		this.date = date;
		this.str = str;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getStr() {
		return str;
	}
	
	@Override
	public String toString() {
		return date + " " + str;
	}

}
