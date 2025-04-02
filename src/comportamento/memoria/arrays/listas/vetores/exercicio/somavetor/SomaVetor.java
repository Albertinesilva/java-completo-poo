package comportamento.memoria.arrays.listas.vetores.exercicio.somavetor;


public class SomaVetor {
    
    private double number;
    private double soma;

    public SomaVetor() {
    }

    public SomaVetor(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double soma(int n, SomaVetor[] somaVetor){
        
        for(int i = 0; i < somaVetor.length; i++){
            soma += somaVetor[i].getNumber();
        }

        System.out.printf("\nSOMA = %.2f", soma);

        return soma;
    }

    public void media(double soma){
       
        System.out.printf("\nMÉDIA = %.2f",soma / 4);
    }
}