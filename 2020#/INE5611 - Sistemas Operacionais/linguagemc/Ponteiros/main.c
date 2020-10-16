#include <stdio.h>

int main() {
    int x = 10;

    int* ptr;

    ptr = &x;

    int y = *ptr;

    printf("X = %d, PTR = %d e por fim, Y= %d", x, ptr, y);

    return 0;
}
