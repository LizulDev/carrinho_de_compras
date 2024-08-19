package exercicio2.comparador;

import java.util.Comparator;
public class ComparadorNumeros implements Comparator<Integer>{
    @Override
    public int compare(Integer num1, Integer num2) {
        // TODO Auto-generated method stub
        if(num1 < num2){
            return -1;
        }
        if (num1 > num2){
            return 1;
        }
        else {
            return 0;
        }
    }
}
