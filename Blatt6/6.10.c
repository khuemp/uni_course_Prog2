#include <stdio.h>
#include <stdlib.h>
#include <getopt.h>

int caculate(float x, float y, char r);

int main(int argc, char** argv){

    char c;

    float x, y;
    char r;

    int xflag = 0;
    int yflag = 0;
    int rflag = 0;

    while ((c = getopt(argc, argv, "hx:y:r:c:")) != -1) {
        switch (c) {
            case 'h':
                printf("The following parameters are allowed:\n\
        -r <char>: Arithmetic operator specifying the arithmetic operation\n\
        -x <float>: 1. number for the given arithmetic operation\n\
        -y <float>: 2. number for the given arithmetic operation\n\
        -c <char*>: any comment\n\
        Here must -r, -x and -y always be given!\n");
            exit(0);

            case 'x':
                x = atof(optarg);
                xflag = 1;
                break;

            case 'y':
                y = atof(optarg);
                yflag = 1;
                break;

            case 'r':
                r = *optarg;
                rflag = 1;
                break;

            case 'c':
                printf("Comment: %s\n", optarg);
                break;

            case '?':
                if (optopt == 'x' || optopt == 'y' || optopt == 'r') {
                    printf("Parameter -%c requires exactly one argument!\
                            See -h for more help.\n", optopt);  
                } else {
                    printf("Error: Parameter -%c unknown.\n", optopt);
                }
                exit(1);

            default:   
                printf("Error: opind %i, argc %i\n", optind, argc);
                exit(1);
        }
    }

        if (rflag == 0 || xflag == 0 || yflag == 0) {
            printf("Not all required arguments are passed!\
                    See -h for more help.\n");
            exit(1);
        }

    int ret = caculate(x, y, r);
    exit(ret);
}

int caculate(float x, float y, char r){

    switch (r) {
        case '+':
            printf("%.5f + %.5f = %.5f\n", x, y, x+y);
            return 0;

        case '-':
            printf("%.5f + %.5f = %.5f\n", x, y, x-y);
            return 0;

        case '*':
            printf("%.5f + %.5f = %.5f\n", x, y, x*y);
            return 0;

        case '/':
            printf("%.5f + %.5f = %.5f\n", x, y, x/y);
            return 0;

        default:
            printf("Arithmetic operator %c is not specified!\n", r);
            return 1;
    }
}