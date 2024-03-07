package bank;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 0, "1");
    accountTwo = new CheckingAccount("Hades", 0, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(2000);
    System.out.println(bankOfGods.accountOne.getBalance());
   
    
    
    bankOfGods.accountOne.consignar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(9000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(6450);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(4300);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(2100);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(1100);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(2600);
    System.out.println(bankOfGods.accountOne.getBalance());
    
     bankOfGods.accountOne.retirar(1500);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(6850);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    
    ////////////////////////////////////////////////////////////////////////////
    System.out.println("//////////////////////////////////////////////////////////////////////////// ");
    
    System.out.println("Cuenta 2: ");
    
    System.out.println("//////////////////////////////////////////////////////////////////////////// ");
    ////////////////////////////////////////////////////////////////////////////
    
    System.out.println(bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.setBalance(5000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(2000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(20000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(30500);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(14200);
    System.out.println(bankOfGods.accountTwo.getBalance());
      
    bankOfGods.accountTwo.consignar(16400);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(15000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(30200);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(13400);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(10000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(6000);
    System.out.println(bankOfGods.accountTwo.getBalance());
      
  }
}