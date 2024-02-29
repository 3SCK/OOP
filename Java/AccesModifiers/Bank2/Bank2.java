
package bank2;
public class Bank2{
  private CheckingAccount2 accountOne;
  private CheckingAccount2 accountTwo;

  public Bank2(){
    accountOne = new CheckingAccount2("Zeus", 100, "1");
    accountTwo = new CheckingAccount2("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank2 bankOfGods = new Bank2();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    //System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    
    bankOfGods.accountOne.consignar(200);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(500);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(450);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(3200);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(750);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(300);
    System.out.println(bankOfGods.accountOne.getBalance());
    
  }
}