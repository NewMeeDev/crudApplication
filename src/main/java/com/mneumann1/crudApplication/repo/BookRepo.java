/**
 * 
 */
package com.mneumann1.crudApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mneumann1.crudApplication.model.Book;

/**
 * @author MNEUMANN1
 *
 */
public interface BookRepo extends JpaRepository<Book, Long>{

}
