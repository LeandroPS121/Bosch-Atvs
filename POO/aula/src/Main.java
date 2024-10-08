package src;

import java.util.Scanner;

import src.dao.ClienteDAO;
import src.dao.EstadoDAO;
import src.dto.Cliente;
import src.dto.Estado;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String escolha = "";

        while (!escolha.equals("1") && !escolha.equals("2")) {
            // Limpa a tela
            for (int i = 0; i < 25; i++) {
                System.out.println("");
            }

            System.out.println(" ________________ Menu ________________ ");
            System.out.println("|                                      |");
            System.out.println("|      Selecione uma opcao abaixo      |");
            System.out.println("|______________________________________|");
            System.out.println("|                                      |");
            System.out.println("|           [1] - CRUD cliente         |");
            System.out.println("|           [2] - CRUD  estado         |");
            System.out.println("|______________________________________|");
            escolha = scanner.nextLine();
        }

        if (escolha.equals("1")) {
            ClienteDAO clienteDAO = new ClienteDAO();
            String clienteEscolha = "";

            while (!clienteEscolha.equals("1") && !clienteEscolha.equals("2") && !clienteEscolha.equals("3") && !clienteEscolha.equals("4")) {
                //Limpa a tela
                for (int i = 0; i < 25; i++) {
                    System.out.println("");
                }

                System.out.println(" ________________ Menu Cliente ________________ ");
                System.out.println("|                                              |");
                System.out.println("|           [1] - Adicionar Cliente            |");
                System.out.println("|           [2] - Listar    Clientes           |");
                System.out.println("|           [3] - Atualizar Cliente            |");
                System.out.println("|           [4] - Deletar   Cliente            |");
                System.out.println("|______________________________________________|");
                clienteEscolha = scanner.nextLine();
            }

            switch (clienteEscolha) {
                case "1": // Adicionar Cliente
                    Cliente novoCliente = new Cliente();
                    System.out.print("Digite o CPF do cliente: ");
                    novoCliente.setCpf(scanner.nextLine());
                    System.out.print("Digite o nome do cliente: ");
                    novoCliente.setNome(scanner.nextLine());
                    System.out.print("Digite o email do cliente: ");
                    novoCliente.setEmail(scanner.nextLine());
                    clienteDAO.adicionarCliente(novoCliente);
                    break;

                case "2": // Listar Clientes
                    for (Cliente cliente : clienteDAO.listarClientes()) {
                        System.out.println(cliente.getCpf() + " - " + cliente.getNome() + " - " + cliente.getEmail());
                    }
                    break;

                case "3": // Atualizar Cliente
                    Cliente clienteAtualizar = new Cliente();
                    System.out.print("Digite o CPF do cliente a ser atualizado: ");
                    clienteAtualizar.setCpf(scanner.nextLine());
                    System.out.print("Digite o novo nome do cliente: ");
                    clienteAtualizar.setNome(scanner.nextLine());
                    System.out.print("Digite o novo email do cliente: ");
                    clienteAtualizar.setEmail(scanner.nextLine());
                    clienteDAO.atualizaCliente(clienteAtualizar);
                    break;

                case "4": // Deletar Cliente
                    System.out.print("Digite o CPF do cliente a ser deletado: ");
                    String idDeletar = scanner.nextLine();
                    clienteDAO.deletarCliente(idDeletar);
                    break;

                default:
                    break;
            }
        } else if (escolha.equals("2")) {
            EstadoDAO estadoDAO = new EstadoDAO();
            String estadoEscolha = "";

            while (!estadoEscolha.equals("1") && !estadoEscolha.equals("2") && !estadoEscolha.equals("3") && !estadoEscolha.equals("4")) {
                //Limpa a tela
                for (int i = 0; i < 25; i++) {
                    System.out.println("");
                }

                System.out.println(" ________________ Menu Estado ________________ ");
                System.out.println("|                                             |");
                System.out.println("|           [1] - Adicionar Estado            |");
                System.out.println("|           [2] - Listar    Estados           |");
                System.out.println("|           [3] - Atualizar Estado            |");
                System.out.println("|           [4] - Deletar   Estado            |");
                System.out.println("|_____________________________________________|");
                estadoEscolha = scanner.nextLine();
            }

            switch (estadoEscolha) {
                case "1": // Adicionar Estado
                    Estado novoEstado = new Estado();
                    System.out.print("Digite a sigla do estado: ");
                    novoEstado.setSigla(scanner.nextLine());
                    System.out.print("Digite a descrição do estado: ");
                    novoEstado.setDescricao(scanner.nextLine());
                    estadoDAO.adicionarEstado(novoEstado);
                    break;

                case "2": // Listar Estados
                    for (Estado estado : estadoDAO.listarEstados()) {
                        System.out.println(estado.getSigla() + " - " + estado.getDescricao());
                    }
                    break;

                case "3": // Atualizar Estado
                    Estado estadoAtualizar = new Estado();
                    System.out.print("Digite a sigla do estado a ser atualizado: ");
                    estadoAtualizar.setSigla(scanner.nextLine());
                    System.out.print("Digite a nova descrição do estado: ");
                    estadoAtualizar.setDescricao(scanner.nextLine());
                    estadoDAO.atualizaEstado(estadoAtualizar);
                    break;

                case "4": // Deletar Estado
                    System.out.print("Digite a sigla do estado a ser deletado: ");
                    String siglaDeletar = scanner.nextLine();
                    estadoDAO.deletarEstado(siglaDeletar);
                    break;

                default:
                    break;
            }
        }

        scanner.close();
    }
}
