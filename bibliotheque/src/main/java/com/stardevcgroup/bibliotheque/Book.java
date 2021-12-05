package com.stardevcgroup.bibliotheque;

public class Book {
	
	private String title;
	private Author author;
	private int publishTime;
	private String commentaire;
	
	public Book() {}

	public Book(String title, Author author, int publishTime, String commentaire) {
		super();
		this.title = title;
		this.author = author;
		this.publishTime = publishTime;
		this.commentaire = commentaire;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(int publishTime) {
		this.publishTime = publishTime;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	

}
