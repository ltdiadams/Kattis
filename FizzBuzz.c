//Logan DiAdams

#include <stdio.h>
#include <stdlib.h>

int main(){

  int X, Y, N;

  scanf("%d %d %d", &X, &Y, &N);

  for (int i = 1; i < N+1; i++){

    if(i % X == 0 && i % Y == 0){
      printf("%s\n", "FizzBuzz");
    }
    else if(i % X == 0){
      printf("%s\n", "Fizz");
    }
    else if(i % Y == 0){
      printf("%s\n", "Buzz");
    }
    else{
      printf("%d\n", i);
    }
  }

  return 0;

}