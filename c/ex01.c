#include <stdio.h>

int main() {
    int a = 10;
    int b = 20;
    int *p;

    p = &a;
    *p = *p + 5;

    p = &b;
    *p = *p + a;

    printf("%d %d", a, b);

    return 0;
}