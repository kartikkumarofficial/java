package OOPs.Encapsulation;

public class test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        //if property or instance variable was public
//        bank.balance=56;

        //using getter to get value
        System.out.println(bank.getBalance());

        //using setter to set value
        bank.setBalance(56);

        //using getter to get the new value
        System.out.println(bank.getBalance());



    }
}
