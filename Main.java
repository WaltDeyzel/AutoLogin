import java.net.URI;
//import java.awt.Desktop;

public class Main{
    public static void main(String[] args){
        String command = args[0];
        System.out.print(command);

        try {
   
            URI uri = new URI("https://sso.sun.ac.za/login?service=https%3A%2F%2Flearn.sun.ac.za%2Flogin%2Findex.php");
            
            java.awt.Desktop.getDesktop().browse(uri);
             System.out.println("Web page opened in browser");
          
           } catch (Exception e) {
            
            e.printStackTrace();
           }
    }
}