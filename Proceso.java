import java.io.IOException;

class Proceso {
    public static void main(String[] args) throws IOException {

        ProcessBuilder builder = new ProcessBuilder("mspaint.exe"); 
        builder.start(); 
        
        
        System.out.println("Hello, World.");
    }
}