#include <stdio.h>
#include <stdlib.h>

// int power2(int n){
//     int res = 1;
//     while (n>0) {
//         res = 2*res;
//         n--;
//     }
//     return res;
// }

// int main(){
//     int result = power2(3);
//     printf("Die Zahl ist: %d\n", result);
//    return 0;
// }   

int power(int a, int n){
    int res = 1;
    while (n>0) {
        res = a*res;
        n--;
    }
    return res;
}

int main(int argc, char** argv){
    if (argc != 3) {
        printf("Wrong argument\n");
        return 0;
    }

    int a = atoi(argv[1]);
    int n = atoi(argv[2]);

    if (n<0) {
        printf("unsupported\n");
        return 0;
    }

    int result = power(a,n);
    printf("Die Zahl ist: %d\n", result);

    return 0;
}