public class Ex05 {}

void main() {
    Scanner sc = new Scanner(System.in);
    int escolha;
    IO.println("1 - Diga olá \n2 - Mostrar uma mensagem \n3 - Sair \n ");
    do {

        escolha= sc.nextInt();
        if (escolha == 1 ) {
            IO.println("Olá");
        }else if (escolha == 2){
            IO.println("Fique feliz !!");

        } else if (escolha == 3) {
            IO.println("Você saiu :(");
        }


        else {
            IO.println("Digite uma opção válida");
        }

    }while( escolha != 3);

        }