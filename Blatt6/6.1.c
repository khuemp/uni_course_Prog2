#include <stdio.h>

int main(){
    float h;
    int m;
    printf("Enter your height: ");
    scanf("%f", &h);
    printf("Enter your weight: ");
    scanf("%d", &m);
    printf("Your BMI is: %f\n", m/(h*h));
    return 0;
}