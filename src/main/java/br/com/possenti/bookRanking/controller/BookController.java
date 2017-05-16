package br.com.possenti.bookRanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.possenti.bookRanking.dao.BookDAO;
import br.com.possenti.bookRanking.model.Book;
import br.com.possenti.bookRanking.model.PriceType;


@Controller
@RequestMapping("livros")
public class BookController {

	@Autowired
	private BookDAO bookDao;

	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("livros/form");
		modelAndView.addObject("types", PriceType.values());
		return modelAndView;
	}

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView save(Book book, RedirectAttributes redirectAttributes) {
		System.out.println(book);
		bookDao.save(book);
		redirectAttributes.addFlashAttribute("sucesso","Livro cadastrado com sucesso!");
		return new ModelAndView("redirect:livros");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		List<Book> books = bookDao.list();
		ModelAndView modelAndView = new ModelAndView("livros/list");
		modelAndView.addObject("books", books);
		return modelAndView;
	}

}
