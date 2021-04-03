#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ano_nascimento = 1982;
    int ano_atual = 2021;
    int idade = ano_atual - ano_nascimento;
    int hora_cinema = 20;
    int idade_cinema = 16;
    int hora_atual = 9;

    char seu_nome[256];
    char seu_sobrenome[256];
    int ano_nasceu;
    int sua_idade;


    printf("Hello, world!\n");
    printf("Sou o Andre, aluno Danki!\n");
    printf("Tenho %d anos, nasci em %d.\n\n\n", idade, ano_nascimento);

    printf("Qual o seu nome?\n");
    scanf("%s", seu_nome);

    printf("\nLegal te conhecer %s\nE seu sobrenome?\n", seu_nome);
    scanf("%s", seu_sobrenome);
    printf("\nSuas inicias sao %c%c\n", seu_nome[0], seu_sobrenome[0]);

    printf("\nMuito prazer!\nEm que ano voce nasceu %s %s?\n",seu_nome,seu_sobrenome);

    scanf("%d",&ano_nasceu);
    sua_idade = ano_atual - ano_nasceu;

    printf("\nShow, voce tem %d anos.\n\n\n",sua_idade);

    if (sua_idade <= 12){
        printf("Voce e crianca\n\n");

    }else if (sua_idade >= 21 & sua_idade <= 80){
        printf("Voce e adulto\n\n");

    }else if (sua_idade > 80){
        printf("Voce e idoso\n\n");

    }else{
        printf("Voce e adolecente.\n\n");
    }

    printf("Check a idade e o horario do cinema!\n");


    if(sua_idade > idade_cinema){
        printf("Voce pode ir ao cinema\n\n");

        while(hora_atual - 1 <= hora_cinema + 10){
            // Posso entrar no cinema?
            if(hora_atual > hora_cinema + 10){
                printf("\nPassou do tempo limite!\nNao pode entrar.\n\n");

            }else if(hora_atual < hora_cinema - 10){
                printf("\nAinda nao abriram a porta do cinema!\nTem que esperar.\n\n");
            }else{
                printf("Pode entrar! Esta na hora.\n");
            }
            hora_atual++;
        }
    }else{
        printf("Voce nao tem idade pra ir ao cinema.\n");
    }

    return 0;
}
