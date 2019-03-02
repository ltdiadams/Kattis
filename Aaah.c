#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

  char first[20];
  char second[20];
  /*
  scanf ("%s", first);
  scanf ("%s", second);
  */
  fgets(first, sizeof(first), stdin);
  fgets(second, sizeof(second), stdin);

  if(strlent(first) < strlent(second)){
    printf("%s", "no\n");
  }
  else{
    printf("%s", "go\n");
  }
return 0;

}

int strlent(const char* str)
{
  int i=0;
  while (str[i] != 0)
    i++;

  return i;
}