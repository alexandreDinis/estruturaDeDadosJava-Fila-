import Fila.Fila;

public class App {
    public static void main(String[] args) throws Exception {
        
     
        Fila f = new Fila();

       System.out.println(f.isEmpyt());
       
        f.push(35);
        f.push(46);
        f.push(100);
        f.push(34);
        f.push(31);
        f.push(88);
        f.push(99);
        f.push(39);
        f.push(1);
        f.push(23);

        System.out.println(f.isFull());

        while(!f.isEmpyt()){
            int num = f.pop();
            System.out.println(num);
        }



    }
}
