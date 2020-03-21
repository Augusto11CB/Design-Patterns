package state.state;

import state.domain.Book;

public interface State {

    void insertCreditCard();

    void cancelPurchase();

    void order(Book book);

    void dispense(Book book);

    //void refill();

}
