#include <stdio.h>

int main(){
    int zahlen[] = {-13427, -4233, -343, -12, -5, 0, 3, 17, 512, 2355, 29367};
    int n = sizeof(zahlen)/sizeof(zahlen[0]);
    for (int i = 0; i<n; ++i) {
        printf("0x%08x\t", (unsigned int) zahlen[i]);
        printf("%.2f\t", zahlen[i]/1000.0);
        printf("%+d\n", zahlen[i]);
    }
    return 0;
}