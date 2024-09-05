#include <stdio.h>

int max(int x, int y){    
    if (x>y){
        return x;
    } else {
        return y;
    }
}

int main(){
    int a = 10;
    int b = 20;
    
    int res = max(a,b);

    printf("Maximum von a und b: %d\n", res);

    return 0;
}