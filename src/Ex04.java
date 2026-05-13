
void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Digite um número");

    int i= sc.nextInt();
    int  m = 0;
    do {
        m++;
        IO.println(i +" * " + m +" = "+ (i*m));
    }while( m != 10);


}







