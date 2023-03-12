public class Calculator   {
    //global static/class variables
    static int a = 10;
    static int b = 5;
    static int answer;
    //no return type no parameter user defined method
 static void addition(){
     answer = a+b;
     System.out.println(answer);
 }
    //no return type no parameter user defined method
 static void substation(){
     answer = a-b;
     System.out.println(answer);
 }
    //no return type no parameter user defined method
    static void multiplication(){
     answer = a*b;
     System.out.println(answer);
    }
    //no return type no parameter user defined method
    static void division(){
     answer = a / b;
     System.out.println(answer);
    }
    //main method
    public static void main(String[] args) {
        addition();
        substation();
        multiplication();
        division();
    }
}

