package br.edu.infnet.biblioteca.domain.service.book;

import br.edu.infnet.biblioteca.domain.model.data.BookRequest;
import br.edu.infnet.biblioteca.domain.model.data.book.Book;

public interface BookService {

    Book createBook(BookRequest studentRequest);

    Book findBookByUuid(String bookUuid);
}
