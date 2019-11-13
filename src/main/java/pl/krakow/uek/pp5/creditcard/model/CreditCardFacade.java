package pl.krakow.uek.pp5.creditcard.model;

public class CreditCardFacade {

    public CreditCardFacade() {
        this.storage = new InMemory
    }

    public void withdraw(WithdrawCommand withdrawCommand) {
        CreditCard loaded = storage.load(withdrawCommand.getCCNumber());

        loaded.withdraw(withdrawCommand.getAmount());

        storage.add(loaded);
    }
}