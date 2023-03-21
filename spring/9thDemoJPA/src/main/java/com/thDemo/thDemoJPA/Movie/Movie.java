package com.thDemo.thDemoJPA.Movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mid;
	private String mname;
	private String director;
	private String language;
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Movie(int mid, String mname, String director, String language) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.director = director;
		this.language = language;
	}
	public Movie() {
		super();
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", director=" + director + ", language=" + language + "]";
	}
	
	
}
