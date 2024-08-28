public class Generics<T, U> {
    private T valueT;
    private U valueU;

//    initialisation
    public Generics(T valueT, U valueU) {
        this.valueT = valueT;
        this.valueU = valueU;
    }

    public void setT(T valueT) {
        this.valueT = valueT;
    }

    public void setU(U valueU) {
        this.valueU = valueU;
    }

    public T getT() {
        return valueT;
    }
    public U getU(){
        return valueU;
    }

    public void swapPair() {
        T temp = valueT;
        valueT = (T) valueU;
        valueU = (U) temp;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + valueT + ", second=" + valueU+ '}';
    }

    public static void main(String[] args) {
        Generics<Integer, String > pair = new Generics<>(1, "Hello");
        System.out.println("Original pair: " + pair);

        pair.swapPair();

        System.out.println("Swapper pair: "+ pair);

    }
}
