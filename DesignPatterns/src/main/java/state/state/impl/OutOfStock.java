package state.state.impl;

import state.BookMachine;
import state.domain.Book;
import state.state.State;

public class OutOfStock implements State {

    private BookMachine bookMachine;

    public OutOfStock(BookMachine bookMachine) {
        this.bookMachine = bookMachine;
    }

    @Override
    public void insertCreditCard() {
        System.out.println("Sorry the machine is sold out");
    }

    @Override
    public void cancelPurchase() {
        System.out.println("Sorry the machine is sold out");
    }

    @Override
    public void order(Book book) {
        System.out.println("Sorry the machine is sold out");
    }

    @Override
    public void dispense(Book book) {
        System.out.println("Sorry the machine is sold out");
    }
}
