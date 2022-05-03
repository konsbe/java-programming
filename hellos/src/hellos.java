public class hellos {
    public static void main(String[] args){
    int myIntiger = 3;
        byte myByte = 33;
        long praxies;
        double myDouble = 2.25d;
        float myFloat = 2.25f;
        char myChar = 'A' ;
        boolean myBool = false;
        if (!myBool){
            String myString = "Asdfor?q=";
            System.out.println(myString);
        }else{
            System.out.println("myString");

        }
        System.out.println("intiger limits :"+ Integer.MIN_VALUE+":"+Integer.MAX_VALUE);
        System.out.println("byte limits :"+ Byte.MIN_VALUE+":"+ Byte.MAX_VALUE);
        long myLong =100L;
        praxies = (long)(myIntiger + myByte);
        System.out.println("long limits :"+ myLong+":"+ Long.MAX_VALUE);

        double two = 20.00d;
        double secTwo = 80.00d;
        double totalTwo = (two + secTwo) * 100d;
        double theRemainder = totalTwo % 40.00d;
        boolean isNoRemainder = (theRemainder ==0) ? true:false;
        if(!isNoRemainder || !myBool ){
            System.out.println("Got some remainder at: "+totalTwo+" : "+ theRemainder);
        }
    }
}
