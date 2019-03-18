#include <stdio.h>

int main(){

  int count, i;
  scanf("%d", &count);

  for(i = 1; i <= count; i++){
    printf("%d %s \n", i, "Abracadabra");
  }

  return 0;
}