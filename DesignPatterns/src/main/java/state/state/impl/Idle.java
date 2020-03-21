package state.state.impl;

import state.BookMachine;
import state.domain.Book;
import state.state.State;

public class Idle implements State {

    private BookMachine bookMachine;

    public Idle(BookMachine bookMachine) {
        this.bookMachine = bookMachine;
    }

    @Override
    public void insertCreditCard() {
        System.out.println("CreditCardInserted");
        bookMachine.setCurrentState(bookMachine.getHasCreditCard());
    }

    @Override
    public void cancelPurchase() {
        System.out.println(".....");
    }

    @Override
    public void order(Book book) {
        System.out.println("Please, insert credit card to order a book");

    }

    @Override
    public void dispense(Book book) {
        System.out.println("Please, insert credit card to order a book");
    }
}
