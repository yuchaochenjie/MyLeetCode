public class Solution {

    public double myPow(double x, int n) {

        if(n==0) return 1.; 

        if(x==0.) return 0.;

        if(n<0){

            n=-n;

            x=1./x;

        }

        double temp = myPow(x,n/2);

        return n%2==0?temp*temp:temp*temp*x;

    }

} 


