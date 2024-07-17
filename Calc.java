public class Calc {

    public static void main(String [] args ) throws Exception {
        int  var1  = 9123;
        int  var2  = 9012;

        int var3 = var1+var2;
        int var4 = var1-var2;
        int var5 = var1*var2;
        int var6 = var1/var2;
        System.out.println("Addition of " +var1 +" and " +var2 +" = " +var3);
        System.out.println("Subtration of " +var1 +" and " +var2 +" = " +var4);
        System.out.println("Multiplication of " +var1 +" and " +var2 +" = " +var5);
        System.out.println("Division of " +var1 +" and " +var2 +" = " +var6);
    }
}
