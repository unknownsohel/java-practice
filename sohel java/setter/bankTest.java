package setter;

import bank.Bank;

public class bankTest {

    public static void main(String[] args) {

        Bank ban = new Bank();
        ban.setaccountNo("7864569766");
        ban.setBalance(678976.67);
        ban.deposite(1240.97);
        ban.withdrawl(250.87);

        System.out.println("your balance " + ban.getBalance());

    }

}
