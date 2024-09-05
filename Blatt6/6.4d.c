#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char* strcpy_myself(char* pointer, const char* string){
    while ((*pointer++ = *string++) != 0) {
    // printf("%d\n", (*(pointer-1) = *(string-1))); 
    //move 'T(84)', 'r(114)', 'u(117)', 'e(101)', 'NUL(0)' from string to pointer until reach NUL i.e (*pointer++ = *string++) == 0
    }
    return pointer;
}

char* bool_eval(int x){
    char* ret;
    if (x==0) {
        ret = malloc(6*sizeof(char));
        strcpy_myself(ret, "False");
    } else {
        ret = malloc(5*sizeof(char));
        strcpy_myself(ret, "True");
    }
    return ret;
}

int main(int argc, char** argv){
    if (argc != 2) {
        fprintf(stderr, "Invalid number of arguments!\n");
    } else {
    char* test = bool_eval(atoi(argv[1]));
    printf("%s\n", test);

    free(test);
    }

    return 0;
}