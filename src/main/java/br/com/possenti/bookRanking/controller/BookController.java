package br.com.possenti.bookRanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.possenti.bookRanking.dao.BookDAO;
import br.com.possenti.bookRanking.model.Book;

@Controller
public class BookController {
	
	@Autowired
	private BookDAO dao;
	
	@RequestMapping("/livros/form")
	public String form() {
		return "livros/form";
	}

	@RequestMapping("/livros")
	public String save(Book book) {
		System.out.println(book);
		dao.save(book);
		return "livros/ok";
	}
	
}
