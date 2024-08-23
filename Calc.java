public class Calc {

    public static void main(String [] args ) throws Exception {
        double  var1  = 9123.1;
        double  var2  = 9012.2;

        double var3 = var1+var2;
        double var4 = var1-var2;
        double var5 = var1*var2;
        double var6 = var1/var2;
        System.out.println("Addition of " +var1 +" and " +var2 +" = " +var3);
        System.out.println("Subtration of " +var1 +" and " +var2 +" = " +var4);
        System.out.println("Multiplication of " +var1 +" and " +var2 +" = " +var5);
        System.out.println("Division of " +var1 +" and " +var2 +" = " +var6);
    }
}
