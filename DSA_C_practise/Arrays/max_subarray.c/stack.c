#include <stdio.h>
#include <ctype.h>
#include <string.h>

#define MAX 100

char stack[MAX];
int top = -1;

void push(char x) {
    if (top < MAX - 1)
        stack[++top] = x;
}

char pop() {
    if (top == -1)
        return -1;
    else
        return stack[top--];
}

int precedence(char x) {
    if (x == '^')
        return 3;
    if (x == '*' || x == '/')
        return 2;
    if (x == '+' || x == '-')
        return 1;
    return 0;
}

int main() {
    char exp[MAX];
    char *e, x;

    printf("Enter infix expression: ");
    scanf("%s", exp);

    printf("Postfix: ");

    e = exp;
    while (*e != '\0') {
        if (isalnum(*e))  // Operand → directly print
            printf("%c", *e);
        else if (*e == '(')  // Push '('
            push(*e);
        else if (*e == ')') {
            while ((x = pop()) != '(')  // Pop until '('
                printf("%c", x);
        } else {  // Operator
            while (precedence(stack[top]) >= precedence(*e))
                printf("%c", pop());
            push(*e);
        }
        e++;
    }

    while (top != -1) {  // Pop remaining operators
        printf("%c", pop());
    }

    return 0;
}
