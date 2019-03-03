// Logan DiAdams

#include <stdio.h>
#include <stdlib.h>

int main(){

  int count = 0;
  int num, temp;
  scanf("%d", &num);

  for (int i = 0; i < num; i++){
    scanf("%d", &temp);

    if(temp < 0){
      count++;
    }
  }
  printf("%d\n", count);
  return 0;
}