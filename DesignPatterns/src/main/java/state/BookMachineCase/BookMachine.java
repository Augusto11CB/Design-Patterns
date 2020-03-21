package state.BookMachineCase;

import lombok.Data;
import state.BookMachineCase.domain.Book;
import state.BookMachineCase.state.State;
import state.BookMachineCase.state.impl.HasCreditCard;
import state.BookMachineCase.state.impl.Idle;
import state.BookMachineCase.state.impl.OutOfStock;

import java.util.Map;

@Data
public class BookMachine {


    private Map<Book, Integer> stock;

    private State idle;
    private State hasCreditCard;
    private State outOfStock;

    private State currentState;

    public BookMachine(Map<Book, Integer> bookStock) {
        this.loadStates();

        this.stock = bookStock;

        this.currentState = bookStock.isEmpty() ? outOfStock : idle;


    }


    public void insertCreditCard() {
        currentState.insertCreditCard();
    }


    public void cancelPurchase() {
        currentState.cancelPurchase();
    }


    public void order(Book book) {
        currentState.order(book);
        currentState.dispense(book);
    }


    public void releaseBook(Book book) {
        int newQuantityBook =  stock.get(book)-1;
        stock.replace(book,newQuantityBook);
    }

    public boolean hasbook(Book book) {
        return stock.containsKey(book) && stock.get(book) > 0;
    }

    private void loadStates() {

        this.idle = new Idle(this);
        this.hasCreditCard = new HasCreditCard(this);
        this.outOfStock = new OutOfStock(this);
    }
}
