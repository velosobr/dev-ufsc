#include <stdio.h>

int main() {
    printf("Hello, pessoal do C World\n");

    /* Variables_and_Types */
  int a = 3;
  float b = 4.5;
  double c = 5.25;
  float sum = a + b + c;


  printf("The sum of a, b, and c is %f.", sum);
    

    /* Array */
    int grades[3];
    int average;

  grades[0] = 80;
 grades[1] = 85;
  grades[2] = 90;

  average = (grades[0] + grades[1] + grades[2]) / 3;
  printf("The average of the 3 grades is: %d", average);
    
    /* Multidimensional_Arrays */



    return 0;
    
    
}
