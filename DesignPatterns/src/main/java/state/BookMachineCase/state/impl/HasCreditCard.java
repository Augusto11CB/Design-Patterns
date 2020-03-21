package state.BookMachineCase.state.impl;

import state.BookMachineCase.BookMachine;
import state.BookMachineCase.domain.Book;
import state.BookMachineCase.state.State;

public class HasCreditCard implements State {

    private BookMachine bookMachine;

    public HasCreditCard(BookMachine bookMachine) {
        this.bookMachine = bookMachine;
    }

    @Override
    public void insertCreditCard() {
        System.out.println("Credit alredy inserted");
    }

    @Override
    public void cancelPurchase() {
        System.out.println("Cancelling Purchase....");
        System.out.println("Please, remove your credit card");
        bookMachine.setCurrentState(bookMachine.getIdle());
    }

    @Override
    public void order(Book book) {
        System.out.println("Order received");

        if (!bookMachine.hasbook(book)) {
            bookMachine.setCurrentState(bookMachine.getOutOfStock());
        }
    }

    @Override
    public void dispense(Book book) {

        bookMachine.releaseBook(book);

        if (bookMachine.getStock().values().stream().allMatch(v -> v == 0)) {
            bookMachine.setCurrentState(bookMachine.getOutOfStock());
        } else {
            bookMachine.setCurrentState(bookMachine.getIdle());
        }
    }
}
