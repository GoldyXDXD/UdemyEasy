/*
В класс BankAccount добавьте 2 метода. Первый метод называется 
popolnenieScheta и увеличивает баланс на сумму, которая указана в 
параметре этого метода. Второй метод называется snyatieSoScheta и 
уменьшает баланс на сумму, которая указана в параметре этого метода.
*/

class BankAccount {
    private long id;
    private String name;
    private BigDecimal balance;

    public void snyatieSoScheta(long money) {
        balance.subtract(BigDecimal.valueOf(money));
    }

    public void popolnenieScheta(long money) {
        balance.add(BigDecimal.valueOf(money));
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
