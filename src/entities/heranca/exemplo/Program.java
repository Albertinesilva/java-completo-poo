package entities.heranca.exemplo;

public class Program {

  public static void main(String[] args) {

    limparTela();
    Account acc = new Account(1001, "Alex", 1000.00);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
    acc.withdraw(200.0);
    System.out.println(acc.getBalance());

    // UPCASTING
    Account acc1 = bacc;
    System.out.println(acc1.getHolder());
    Account acc2 = new BusinessAccount(1003, "Bob", 1000.00, 500.0);

    //Sobreposição ou sobrescrita (override) é a implementação de um método de uma superclasse na subclasse (sobrescrever).
    acc2.withdraw(200.0);
    System.out.println(acc2.getBalance());
    Account acc3 = new SavingsAccount(1004, "Anna", 1000.00, 0.01);
    
    //Sobreposição ou sobrescrita (override) é a implementação de um método de uma superclasse na subclasse (sobrescrever).
    acc3.withdraw(200.0);
    System.out.println(acc3.getBalance());

    // DOWNCASTING
    BusinessAccount acc4 = (BusinessAccount) acc2;
    acc4.loan(100.0);

    // BusinessAccount acc5 = (BusinessAccount) acc3;
    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.loan(200.0);
      System.out.println("Loan!");
    }

    if (acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount) acc3;
      acc5.updateBalance();
      System.out.println("Update!");
    }
  }

  public static void limparTela() {
    try {
      final String os = System.getProperty("os.name");

      if (os.contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    } catch (final Exception e) {
      // Trata exceções (pode ser uma exceção de interrupção)
      e.printStackTrace();
    }
  }
}
