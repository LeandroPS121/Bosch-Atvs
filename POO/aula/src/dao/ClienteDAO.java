package src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import src.connect.ConexaoDB;
import src.dto.Cliente;

public class ClienteDAO {
    public boolean adicionarCliente(Cliente cliente) {
        String query = "INSERT INTO tbcliente (cpf, nome, email) VALUES (?, ?, ?)";
        try (Connection connection = ConexaoDB.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar cliente: " + e.getMessage());
            return false;
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM tbcliente";
        try (Connection connection = ConexaoDB.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());
            return null;
        }
    }

    public boolean atualizaCliente(Cliente cliente) {
        String query = "UPDATE tbcliente SET nome = ?, email = ? WHERE cpf = ?";
        try (Connection connection = ConexaoDB.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getCpf());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cliente: " + e.getMessage());
            return false;
        }
    }

    public boolean deletarCliente(String cpf) {
        String query = "DELETE FROM tbcliente WHERE cpf = ?";
        try (Connection connection = ConexaoDB.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cpf);
            stmt.executeUpdate();
            System.out.println("Cliente deletado com sucesso");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar cliente: " + e.getMessage());
            return false;
        }
    }
}
