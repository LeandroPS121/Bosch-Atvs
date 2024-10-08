package src;
public class Recursos {
    public static void limpaTela(){
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }
    public static void gerarMenu(int numero){
        switch (numero) {
            case 1:
            System.out.println(" ________________ Menu ________________ ");
            System.out.println("|                                      |");
            System.out.println("|      Selecione uma opcao abaixo      |");
            System.out.println("|______________________________________|");
            System.out.println("|                                      |");
            System.out.println("|           [1] - CRUD cliente         |");
            System.out.println("|           [2] - CRUD  estado         |");
            System.out.println("|______________________________________|");
                break;
            case 2:
            System.out.println(" ________________ Menu Cliente ________________ ");
            System.out.println("|                                              |");
            System.out.println("|           [1] - Adicionar Cliente            |");
            System.out.println("|           [2] - Listar    Clientes           |");
            System.out.println("|           [3] - Atualizar Cliente            |");
            System.out.println("|           [4] - Deletar   Cliente            |");
            System.out.println("|______________________________________________|");
                break;
            case 3:
            System.out.println(" ________________ Menu Estado ________________ ");
            System.out.println("|                                             |");
            System.out.println("|           [1] - Adicionar Estado            |");
            System.out.println("|           [2] - Listar    Estados           |");
            System.out.println("|           [3] - Atualizar Estado            |");
            System.out.println("|           [4] - Deletar   Estado            |");
            System.out.println("|_____________________________________________|");
                break;
        
            default:
                break;
        }
    }
}