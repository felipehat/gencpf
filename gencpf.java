import java.util.Random;
public class gencpf{
        static int genDig1(){
        Random dig = new Random();
        int sort = 0;
        sort = dig.nextInt(999);
        if(sort < 100){
            sort = 100;
        }
        return sort;
    }
    static int end(){
        Random fim = new Random();
        int sort = 01;
        sort = fim.nextInt(99);
        if(sort < 10){
            sort = 10;
        }
        return sort;
    }
    public static void main(String[] args){
        int digito = 0;
        System.out.printf("%d.%d.%d-%d\n", genDig1(), genDig1(), genDig1(), end());
    }
}