package exercicios_andreia;

public class byte_code{
    public static void main(String [] args){
        byte x = (byte)127;
        Integer w = 3;
        byte b = w.byteValue();
        byte y = (byte) (x + b);

        System.out.println(x);
        System.out.println(y);
        
    }
}
