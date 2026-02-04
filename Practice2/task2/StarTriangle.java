package task2;

public class StarTriangle {
    private int width;

    public StarTriangle(int width){
        this.width = width;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        int h = 1;
        for(int i = 0; i < width; i++){
            sb.append("[*]".repeat(h));
            if(i<width-1) sb.append("\n");
            h++;
        }
        return sb.toString();
    }

}
