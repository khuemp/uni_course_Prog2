#include <stdio.h> 
#include <stdlib.h>

int schalt(int n){
    if (n%4 == 0) {
        if (n%100 != 0) {
            return 1;
        }
    }
    if (n%400 == 0) {
        return 1;
    }
    return 0;
}

int main(int argc, char** argv){
    int input = atoi (argv[1]);
    printf("%d\n", schalt (input));
    return 0;
}