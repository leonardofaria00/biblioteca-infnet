package br.edu.infnet.biblioteca.state;

import br.edu.infnet.biblioteca.domain.model.data.book.Book;

public class AvailableState implements BookState {
    @Override
    public void next(final Book book) {
        book.setState(new ReservedState());
        System.out.println("Livro foi reservado!");
    }

    @Override
    public void prev(final Book book) {
        System.out.println("Não existe status anterior a esse.");
    }

    @Override
    public void printStatus() {
        System.out.println("Esse é o status de disponível");
    }
}
