package Blackjack;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random radom= new Random();
        String naipe="";
        int somaJogador=0;
        int somaComputador=0;

        System.out.println("--Jogo 21--");

        for (int i=0;i<2;i++) {
            Naipe jogadorNaipe = Naipe.values()[radom.nextInt(4)];
            System.out.print( jogadorNaipe.toString() + ":");
            Valor jogadorValor=Valor.values()[radom.nextInt(13)];
            System.out.println(jogadorValor.getValor());
            somaJogador +=jogadorValor.getValor();

            Naipe computadorNaipe= Naipe.values()[radom.nextInt(4)];
            Valor computadorValor=Valor.values()[radom.nextInt(13)];
            somaComputador +=computadorValor.getValor();
        }

        boolean sair=false;
        do {
            System.out.println("Se deseja continuar digite S se se quiser sair digite N");
            String escolha=scanner.nextLine();
            if(escolha.equalsIgnoreCase("S") || escolha.equalsIgnoreCase("Sim")) {
                Naipe jogadorNaipe = Naipe.values()[radom.nextInt(4)];
                System.out.print( jogadorNaipe.toString() + ":");
                Valor jogadorValor=Valor.values()[radom.nextInt(13)];
                System.out.println(jogadorValor.getValor());
                somaJogador +=jogadorValor.getValor();

                Naipe computadorNaipe= Naipe.values()[radom.nextInt(4)];
                Valor computadorValor=Valor.values()[radom.nextInt(13)];
                somaComputador +=computadorValor.getValor();

                sair=false;
            }else if (escolha.equalsIgnoreCase("N")|| escolha.equalsIgnoreCase("não")|| escolha.equalsIgnoreCase("Nao")) {
                System.out.println("Fim do jogo");
                sair=true;

            }else {
                System.out.println("Dados invalidos.Digite novamente");
                sair=false;
            }
        }while(!sair);

        System.out.println("Placar do Jogo");

        if (somaJogador>somaComputador && somaJogador <=21) {
            System.out.println("Você venceu!");
            System.out.println("Jogador: "+somaJogador+" X Computador:"+somaComputador );
        }else if (somaComputador> somaJogador && somaComputador<=21 ) {
            System.out.println("O computador venceu!");
            System.out.println("Computador "+somaComputador+ " X Jogador: "+somaJogador);
        }else if(somaJogador<somaComputador && (somaComputador>21 && somaJogador<=21)) {
            System.out.println("Você venceu!");
            System.out.println("Jogador: "+somaJogador+" X Computador: "+somaComputador );
        }else if(somaComputador< somaJogador && (somaJogador>21 && somaComputador<=21)) {
            System.out.println("O computador venceu!");
            System.out.println("Computador "+somaComputador+ " X Jogador: "+somaJogador);
        }   else  {
            System.out.println("Ambos estouraram o valor");
            System.out.println("Jogador: "+somaJogador+" X Computador: "+somaComputador );
        }
    }
}
