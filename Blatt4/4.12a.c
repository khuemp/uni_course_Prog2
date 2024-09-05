#include <stdio.h>

int main(){
    int j = 100;
    int z = 5;
    do {
        printf("Die Zahl ist %i\n", j);
        j -= z;
    } while (j>=0);
    return 0;
}