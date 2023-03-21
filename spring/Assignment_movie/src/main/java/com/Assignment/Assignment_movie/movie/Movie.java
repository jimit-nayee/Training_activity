package com.Assignment.Assignment_movie.movie;

public class Movie {

	private int mob_num;
	private String movie_name;
	private String date;
	private String time;
	private String ticket_type;
	private int number_of_ticket;
	private String payment_type;
	private String transaction_number;

	public int getMob_num() {
		return mob_num;
	}

	public void setMob_num(int mob_num) {
		this.mob_num = mob_num;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTicket_type() {
		return ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

	public int getNumber_of_ticket() {
		return number_of_ticket;
	}

	public void setNumber_of_ticket(int number_of_ticket) {
		this.number_of_ticket = number_of_ticket;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getTransaction_number() {
		return transaction_number;
	}

	public void setTransaction_number(String transaction_number) {
		this.transaction_number = transaction_number;
	}

	@Override
	public String toString() {
		return "Movie [mob_num=" + mob_num + ", movie_name=" + movie_name + ", date=" + date + ", time=" + time
				+ ", ticket_type=" + ticket_type + ", number_of_ticket=" + number_of_ticket + ", payment_type="
				+ payment_type + ", transaction_number=" + transaction_number + "]";
	}

	public Movie(int mob_num, String movie_name, String date, String time, String ticket_type, int number_of_ticket,
			String payment_type, String transaction_number) {
		super();
		this.mob_num = mob_num;
		this.movie_name = movie_name;
		this.date = date;
		this.time = time;
		this.ticket_type = ticket_type;
		this.number_of_ticket = number_of_ticket;
		this.payment_type = payment_type;
		this.transaction_number = transaction_number;
	}

	public Movie() {
		super();
	}

}
