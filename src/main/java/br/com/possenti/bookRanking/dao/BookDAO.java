package br.com.possenti.bookRanking.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.possenti.bookRanking.model.Book;

@Repository
@Transactional
public class BookDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public void save(Book book){
        manager.persist(book);

	}
	
}
