#ifndef UTILS_H
#define UTILS_H
#include <stdlib.h>

#define print_array(arr, arr_size, TYPE) print_array_TYPE(arr, arr_size)

void print_array_int(int* array, int array_size);
void print_array_char(char* array, int array_size);

#endif