package Fila;

public class Fila {
    private int valores[];
    private int inicio;
    private int fim;
    private int total;

    public Fila(){
        valores = new int[10];
        inicio = 0;
        fim    = 0;
        total  = 0;
    }

    public void push(int elemento){
        valores[fim] = elemento;
        fim = (fim + 1) % 10;
        total ++;

    }

    public boolean isEmpyt(){
        return (total == 0);
    }

    public boolean isFull(){
        return (total == 10);

    }

    public int pop(){
        int elem = valores[inicio];
        inicio = (inicio +1) % 10;
        total --;
        return elem;
        
    }
    
}
