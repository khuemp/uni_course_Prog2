#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* bool_eval(int x){
    char* ret;
    if (x==0) {
        ret = malloc(6*sizeof(char));
        strcpy(ret, "False");
    } else {
        ret = malloc(5*sizeof(char));
        strcpy(ret, "True");
    }
    return ret;
}

char* convert_to_german(char* string){
    if (strcmp(string, "False") == 0) {
        char* ret = realloc (string, 7*sizeof(char));
        strcpy(ret, "Falsch");
        return ret;
    }
    if (strcmp(string, "True") == 0) {
        char* ret = realloc(string, 8*sizeof(char));
        strcpy(ret, "Richtig");
        return ret;
    }
    char* ret = realloc(string, 12*sizeof(char));
    strcpy(ret, "Undefiniert");
    return ret;
}

int main(int argc, char** argv){
    if (argc != 2) {
        fprintf(stderr, "Invalid number of arguments!\n");
    } else {
    char* test = bool_eval(atoi(argv[1]));
    char* convert = convert_to_german(test);
    printf("%s\n", convert);

    free(convert);
    }

    return 0;
}