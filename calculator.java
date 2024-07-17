public class calculator {

    public static void main(String [] args ) throws Exception {
        int  var1  = 9123;
        int  var2  = 9012;
        char operator = '*';
        int answer = 0;

        if(operator == '+'){
            answer = var1 + var2;
        }else if(operator == '-'){
            answer = var1 - var2;
        }else if(operator == '*'){
            answer = var1 * var2;
        }else if(operator == '/'){
            answer = var1 / var2;
        }else{
            System.out.println("invalid operator");
        }
        System.out.println(answer);
    }
}