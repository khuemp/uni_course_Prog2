#include <stdio.h>

int main() {
    for (int i = 1; i<10; i++) {
        if ((i%2) == 0){
            printf("Die Zahl %i ist gerade\n", i);
        } else {
        printf("Die Zahl %i ist ungerade\n", i);
        }
    } 
    return 0;
}