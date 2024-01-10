package entities.heranca.exercicio2;

public class Individual extends TaxPayer {

  private Double healthExpenditures;

  public Individual() {
  }

  public Individual(String name, Double anualIncome, Double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public Double tax() {

    double basicTax;
    if (getAnualIncome() < 20000.00)
      basicTax = getAnualIncome() * 0.15;
    else
      basicTax = getAnualIncome() * 0.25;

    basicTax -= healthExpenditures * 0.5;
    if(basicTax < 0.0)
      basicTax = 0.0;

    return basicTax;

    //Outra forma de fazer utilizando o operador ternário (condicional) para retornar o valor de 
    //basicTax ou 0.0 caso o valor de basicTax seja menor que 0.0 
    // return basicTax - (healthExpenditures * 0.5) > 0 ? basicTax - (healthExpenditures * 0.5) : 0;
  }

}
