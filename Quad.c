//Logan DiAdams
#include <stdio.h>
#include <stdlib.h>

int main(){

  int a, b;

  scanf("%d\n", &a);
  scanf("%d", &b);

  if(a > 0 && b > 0){
    printf("%d", 1);
  }
  else if(a > 0 && b < 0){
    printf("%d", 4);
  }
  else if(a < 0 && b < 0){
    printf("%d", 3);
  }
  else{
    printf("%d", 2);
  }
  return 0;
}