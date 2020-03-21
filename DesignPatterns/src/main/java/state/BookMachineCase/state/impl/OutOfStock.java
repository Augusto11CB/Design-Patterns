package state.BookMachineCase.state.impl;

import state.BookMachineCase.BookMachine;
import state.BookMachineCase.domain.Book;
import state.BookMachineCase.state.State;

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
