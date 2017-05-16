package br.com.possenti.bookRanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.possenti.bookRanking.dao.BookDAO;
import br.com.possenti.bookRanking.model.Book;
import br.com.possenti.bookRanking.model.PriceType;

@Controller
public class BookController {

	@Autowired
	private BookDAO bookDao;

	@RequestMapping("/livros/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("livros/form");
		modelAndView.addObject("types", PriceType.values());
		return modelAndView;
	}

	@RequestMapping(value="/livros", method=RequestMethod.POST)
	public String save(Book book) {
		System.out.println(book);
		bookDao.save(book);
		return "livros/ok";
	}
	
	@RequestMapping(value="/livros", method=RequestMethod.GET)
	public ModelAndView list(){
		List<Book> books = bookDao.list();
		ModelAndView modelAndView = new ModelAndView("livros/list");
		modelAndView.addObject("books", books);
		return modelAndView;
	}

}
