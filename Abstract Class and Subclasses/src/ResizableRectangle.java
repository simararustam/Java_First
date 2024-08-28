public class ResizableRectangle implements Resizable{
    int a;

    public ResizableRectangle(int b) {
        this.a = b;
    }
    @Override
    public int resize(int c) {
        a = c;
        return a;
    }
}
