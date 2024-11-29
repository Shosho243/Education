package Return;

public class Test1 {
    public static void main(String[] args) {
   /*     System.out.println(getHelloWorld());
    }
    public static String getHelloWorld() {
        return "Hello World";
*/
if (args.length==0){
    return;
}for (String arg : args) {
            System.out.println(arg);
        }
    }
}
