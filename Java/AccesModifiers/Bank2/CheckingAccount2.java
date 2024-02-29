
package bank2;

public class CheckingAccount2{  //Cuenta1
  private String name;
  private int balance;
  private String id;
  private double interestRate;
  
  
  
  public CheckingAccount2(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    //this.interestRate = 0.02;
  }

  public int getBalance(){
    System.out.println("Su saldo es:   " + balance);
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
  
  public void consignar (int valorDepositado){
      balance = balance + valorDepositado;
  }
  
  public void retirar (int valorRetirado){
      balance = balance - valorRetirado;
  }
}
  