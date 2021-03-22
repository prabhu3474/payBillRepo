package com.payBills.repository;
import org.springframework.data.repository.CrudRepository;

import com.payBills.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
