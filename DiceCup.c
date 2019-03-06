#include <stdio.h>

int main(){

  int N, M, i;

  scanf("%d %d", &N, &M);

  if(N == M){
    printf("%d", N+1);
  }

  if(N < M){

    for(i = N+1; i < M+2; i++){
      printf("%d\n", i);
    }
  }

  if(N > M){

    for(i = M+1; i < N+2; i++){
      printf("%d\n", i);
    }
  }


  return 0;
}