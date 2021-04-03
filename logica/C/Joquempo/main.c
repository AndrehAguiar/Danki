#include <stdio.h>
#include <stdlib.h>

int main()
{
    char player1[256];
    char player2[256];

    printf("Sua vez player 1...\nQual e a sua jogada?\npedra, papel ou tesoura?");
    scanf("%s", &player1);

    printf("\n\nSua vez player 2...\nQual e a sua jogada?\npedra, papel ou tesoura?");
    scanf("%s", &player2);

    if(strcmp(player1, "pedra") == 0){
        if(strcmp(player2, "pedra") == 0){
            printf("\nO jogo empatou!!!\n");
            printf("Player 1 jogou: %s\n",player1);
            printf("Player 2 jogou: %s\n\n",player2);

        }else if(strcmp(player2, "papel") == 0){
            printf("\nO Player 2 venceu!!!\n");
            printf("Player 1 jogou: %s\n",player1);
            printf("Player 2 jogou: %s\n",player2);
            printf("Papel embrulha o pedra.\n\n");

        }else if(strcmp(player2, "tesoura") == 0){
            printf("\nO Player 1 venceu!!!\n");
            printf("Player 1 jogou: %s\n",player1);
            printf("Player 2 jogou: %s\n",player2);
            printf("Papel quebra a tesoura.\n\n");
        }
    }else if(strcmp(player1, "papel") == 0){
        if(strcmp(player2, "papel") == 0){
            printf("\nO jogo empatou!!!\n");
            printf("Player 1 jogou: %s\n",player1);
            printf("Player 2 jogou: %s\n\n",player2);

        }else if(strcmp(player2, "pedra") == 0){
            printf("\nO Player 1 venceu!!!\n");
            printf("Player 1 jogou: %s\n",player1);
            printf("Player 2 jogou: %s\n",player2);
            printf("Papel embrulha o pedra.\n\n");

        }else if(strcmp(player2, "tesoura") == 0){
            printf("\nO Player 2 venceu!!!\n");
            printf("Player 1 jogou: %s\n",player1);
            printf("Player 2 jogou: %s\n",player2);
            printf("Tesoura corta o papel.\n\n");
        }
    }else if(strcmp(player1, "tesoura") == 0){
        if(strcmp(player2, "tesoura") == 0){
            printf("\nO jogo empatou!!!\n");
            printf("Player 1 jogou: %s\n",player1);
            printf("Player 2 jogou: %s\n\n",player2);

        }else if(strcmp(player2, "pedra") == 0){
            printf("\nO Player 2 venceu!!!\n");
            printf("Player 1 jogou: %s\n",player1);
            printf("Player 2 jogou: %s\n",player2);
            printf("Pedra quebra a tesoura.\n\n");

        }else if(strcmp(player2, "papel") == 0){
            printf("\nO Player 1 venceu!!!\n");
            printf("Player 1 jogou: %s\n",player1);
            printf("Player 2 jogou: %s\n",player2);
            printf("Tesoura corta o papel.\n\n");
        }
    }else{
        printf("\nJogada invalida!!\n\n");
        printf("Player 1 jogou: %s\n",player1);
        printf("Player 2 jogou: %s\n",player2);
    }

    return 0;
}
