import java.util.Scanner;

public class HashLinked {
    public static void run() {
        Scanner scan = new Scanner(System.in);

		int sizeList = 0;
        int userChoice = 0;

		System.out.println("Olá, qual vai ser o tamanho da lista? Obs: deve ser maior que 0");
		sizeList = scan.nextInt();

		while(sizeList < 1) {
			System.out.println("Deve ser maior que 0");
			sizeList = scan.nextInt();
		}

        Hash hash = new Hash(sizeList);

        do {
            System.out.println("Escolha uma das opções:\n" + //
                                "(1) - Inserir um valor\n" + //
                                "(2) - Exibir os valores\n" + //
                                "(3) - Procurar um valor\n" + //
                                "(4) - Remover um valor\n" + //
                                "(5) - Encerrar o programa\n" + //
                                "Digite a sua escolha: ");
            System.out.print("O que deseja fazer? ");
            userChoice = scan.nextInt();
            System.out.println("============================");
            int value = 0;
            switch (userChoice) {
                case 1:
                    System.out.print("Qual valor deseja inserir? ");
                    value = scan.nextInt();
                    hash.insertValues(value);
                    System.out.println("----------------------------");
                    break;
                case 2:
                    hash.showList();
                    System.out.println("----------------------------");
                    break;
                case 3:
                    System.out.print("Deseja encontrar qual valor? ");
                    value = scan.nextInt();
                    if(hash.searchValue(value)) {
                        System.out.printf("O valor %d esta na lista\n", value);
                    } else {
                        System.out.printf("O valor %d não foi encontrado na lista\n", value);
                    }
                    System.out.println("----------------------------");
                    break;
                case 4:
                    System.out.print("Deseja apagar qual valor? ");
                    value = scan.nextInt();
                    if(hash.searchValue(value)) {
                        hash.deleteValue(value);
                        System.out.printf("O valor %d deletado\n", value);
                    } else {
                        System.out.printf("O valor %d não esta na lista\n", value);
                    }
                    System.out.println("----------------------------");
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(userChoice != 5);
		
    }
}