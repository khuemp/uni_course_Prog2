#include <stdio.h>

float pot(int n, float x){
    if (n<0 || x<0) {
        return 0;
    }
    float res = 1;
    for (int i = 0; i<n; i++) {
        res *= x;
    }
    return res;
}

void pot_shiny(int n, float x, float* y){
    if (n<0 || x<0 || !y) {
        return;
    }
    *y = 1;
    for (int i = 0; i<n; i++) {
        *y *= x;
    }
}

float pot_switch(int n, float x, int b){
    if (b) {
        float y = 0;
        pot_shiny(n, x, &y);
        return y;
    }
    return pot(n, x);
}

int main(){
    // float y = pot(3, 2.71);

    // float y;
    // pot_shiny(3, 2.71, &y);

    // printf("%.3f\n", y);
    // return 0;
    return pot_switch(3, 2.71, 0) != pot_switch(3, 2.71, 1); //if diffent then a red 1 will appear in the console like this "1 prog2@prog2"
}