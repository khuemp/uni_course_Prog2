#include <stdio.h> 

void magic (int j, int z){
    while (j>=0){
        printf("Die Zahl ist: %i\n", j);
        j -=z;
    }
}

int main (){
    magic (100,5);
    magic (100,10);
    magic (5000,200);
    return 0;
}