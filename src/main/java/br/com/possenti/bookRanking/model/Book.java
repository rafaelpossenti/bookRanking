package br.com.possenti.bookRanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String title;
	private String description;
	private int pages;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	@Override
    public String toString() {
        return "Produto [titulo=" + title + ", descricao=" + description + ", paginas=" + pages + "]";
    }

}
