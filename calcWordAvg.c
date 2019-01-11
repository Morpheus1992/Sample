#include <stdio.h>
#define IN 1
#define OUT 0

//this calculates the average word lenght of a sentence.
int main () {
printf("Enter a sentence: ");
int c, nw, nc, state;
state = OUT;
nw = nc = 0;
int counting = 0;
float average = 0;


while ((c = getchar()) != '.') {
nc++;
if (c == ' ' || c == '\n' || c == '\t'){
state = OUT;
counting++;
}
else if (state == OUT) {
state = IN;
++nw;
}
}
nc = nc-counting+1;
average = (double)nc/(double)nw;

printf("Average word length %.1f \n", average);
 }

