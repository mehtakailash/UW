package cp120.assignments.assignment002;

import java.math.BigInteger;

public final class Numbers {

    //  Lowest common Number
    public static int lcm(int First_number, int Second_number) {
        int x,max=0,min=0,lcm=0, fn=First_number, sn=Second_number;
        if(fn>sn)
        {
            max=fn;
            min=sn;
        }
        else
        {
            max=sn;
            min=fn;
        }

        for(int i=1;i<=min;i++)
        {
            x=max*i;
            if(x%min==0)
            {
                lcm=x;
                break;
            }
        }
        //System.out.printf("lcm( %3d %2d ): %,d\n", fn, sn, lcm);
        return lcm;
    }

    // Example Utility method overloaded
        public static BigInteger factorial(int n){
            BigInteger fact= BigInteger.valueOf(1), j;
            int i;
            int number=n;//It is the number to calculate factorial
            for(i=1;i<=number;i++){
                j=BigInteger.valueOf(i);
                fact=fact.multiply(j);
            }
            //System.out.printf( "factorial( %2d ): %,d\n", n, fact );
            return fact;
        }

    // Example Utility method overloaded
    public static BigInteger factorial(BigInteger n){
        BigInteger fact= BigInteger.valueOf(1), j;
        int i;
        int number=n.intValue();//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            j=BigInteger.valueOf(i);
            fact=fact.multiply(j);
        }
        //System.out.printf( "factorial'( %2d ): %,d\n", n, fact );
        return fact;
    }

}
