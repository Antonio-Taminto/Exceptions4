public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];

        checkDivision(array,0,4);
    }
    public static void checkDivision(int[] dividend , int divisor, int dividendPosition){
        try{
            int result = dividend[dividendPosition] / divisor;
        }catch (ArithmeticException e){
            System.out.println("Non puoi dividere per 0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("posizione del dividendo fuori dal limite");
        }
    }
}