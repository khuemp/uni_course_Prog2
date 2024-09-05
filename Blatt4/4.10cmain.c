#include <stdio.h>
#include "4.10cmax.h"

int main(){
    int a = 10;
    int b = 20;

    int res = max(a, b);

    printf("Maximum von a und b: %d\n", res);

    return 0;
}