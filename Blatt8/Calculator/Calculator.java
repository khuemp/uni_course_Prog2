package Blatt8.Calculator;

public class Calculator {

    public static int compute(int op, int l, int r)
    throws IllegalAccessException{
        int res = 0;
        if (l<0 || r<0 || l>10000 || r>10000){
            throw new IllegalAccessException("Value is too large/small");
        }
        if (op == 4 && r == 0){
            throw new IllegalAccessException("Division by 0 is not allowed");
        }
        switch(op){
            case 1:
                res = l+r;
                break;
            case 2:
                res = l-r;
                break;
            case 3:
                res = l*r;
                break;
            case 4:
                res = l/r;
                break;
            default:
                throw new IllegalAccessException("Op does not exist");
        }
        return res;
    }
}
