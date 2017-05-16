package br.com.possenti.bookRanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.possenti.bookRanking.dao.BookDAO;
import br.com.possenti.bookRanking.model.Book;
import br.com.possenti.bookRanking.model.PriceType;

@Controller
public class BookController {

	@Autowired
	private BookDAO dao;

	@RequestMapping("/livros/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("livros/form");
		modelAndView.addObject("types", PriceType.values());
		return modelAndView;
	}

	@RequestMapping("/livros")
	public String save(Book book) {
		System.out.println(book);
		dao.save(book);
		return "livros/ok";
	}

}
