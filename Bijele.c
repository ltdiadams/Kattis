#include <stdio.h>

int main(){

  int i;
  int pieces[] = {1, 1, 2, 2, 2, 8};
  int number[6];

  scanf("%d %d %d %d %d %d", &number[0], &number[1], &number[2], &number[3], &number[4], &number[5]);

  for(i = 0; i < 6; i++){
    printf("%d ", pieces[i] - number[i]);
  }


  return 0;

}