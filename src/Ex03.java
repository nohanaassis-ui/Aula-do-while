public class Ex03 {}

void main() {
    Scanner sc = new Scanner(System.in);
    int z ;
    int soma =0 ;

    do {

        IO.println("Digite um númeero que você deseja somar , caso não queira digite 0");
        z = sc.nextInt();

        soma += z ;
    }while(z !=0 );

    IO.println( " A soma será " + soma);
}

