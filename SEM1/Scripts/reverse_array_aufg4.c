#include <stdio.h>
#include <stdlib.h>

void reverseArray(int arr[], int size) {
    int temp;
    for (int i=0; i<size/2; i++) {
        temp = arr[i];
        arr[i] = arr[size-1-i];
        arr[size-1-i] = temp;
    }
}

int main() {
    int arr[7] = {1, 2, 3, 4, 5, 6};
    int size = (sizeof(arr) / sizeof(arr[0])) -1;
    reverseArray(arr, size);
    for (int i=0; i<size; i++) printf("%d ", arr[i]);
    return 0;
}