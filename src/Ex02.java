public class Ex01 {}

void main() {
    Scanner sc = new Scanner(System.in);
     int s= 1234;
    IO.println("Digite sua senha para verificar!");
     do {
        s = sc.nextInt();

         if (s != 1234){
             IO.println("Senha incorreta" );
         }
     } while( s != 1234);
         IO.println("Acesso permitido !");
}

