#include <stdio.h>
#include <math.h>

int main()
{
    int n, result;
    scanf("%d",&n);
    while(n>0)
    {
        n--;
        int k;
        scanf("%d",&k);
        result = pow(2, k);
        //printf("%d\n",(1<<k)-1);
        printf("%d\n", result -1);
    }
    return 0;
}