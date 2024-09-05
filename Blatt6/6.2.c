#include <stdc-predef.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

//use snprint to prevent case a/0
int main(){
    int a;
    char op;
    int b;
    char* s = calloc(64, sizeof(char));

    printf("Enter your operation here: ");
    scanf("%d %c %d", &a, &op, &b);

    sprintf(s, "%d %c %d = ", a, op, b); //store string "%d %c %d =" in s

    int slen = strlen(s);
    s +=slen; //move pointer to the end of string "%d %c %d ="

    switch (op) {
        case '+':
            sprintf(s, "%d", a + b);
            break;
        case '-':
            sprintf(s, "%d", a - b);
            break;
        case '*':
            sprintf(s, "%d", a * b);
            break;
        case '/':
            sprintf(s, "%d", a / b);
            break;            
        default:
            sprintf(s - slen, "Invalid input!");
    } //add result
    s -= slen; //return pointer to beginning of "%d %c %d ="
    printf("%s\n", s);

    free(s);
    return 0;
}