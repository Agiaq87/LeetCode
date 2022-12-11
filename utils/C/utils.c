#include "util.h"

void print_array_int (int* array, int array_size) {
    unsigned int i = 0;

    while(i < array_size) {
        printf("[%d] %d", i, *(array + i));
        i++;
    }
}

void print_array_char(char* array, int array_size) {
    unsigned int i = 0;

    while(i < array_size) {
        printf("[%d] %d", i, *(array + i));
        i++;
    }
}