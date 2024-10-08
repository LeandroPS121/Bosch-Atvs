package src.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import src.connect.ConexaoDB;
import src.dto.Estado;

public class EstadoDAO {
    public boolean adicionarEstado(Estado estado) {
        String query = "INSERT INTO tbestado (sigla, descricao) VALUES (?,?)";
        try (Connection connection = ConexaoDB.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, estado.getSigla());
            stmt.setString(2, estado.getDescricao());
            stmt.executeUpdate();
            stmt.close();
            return true;
        } catch (SQLException e) {
            System.out.println("erro estado: " + e);
            return false;
        }
    }

    public List<Estado> listarEstados() {
        List<Estado> estados = new ArrayList<>();
        String query = "SELECT * FROM tbestado";
        try (Connection connection = ConexaoDB.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Estado estado = new Estado();
                estado.setSigla(rs.getString("sigla"));
                estado.setDescricao(rs.getString("descricao"));
                estados.add(estado);
            }
            return estados;
        } catch (SQLException e) {
            System.out.println("Erro listar estado: " + e);
            return null;
        }
    }

    public boolean atualizaEstado(Estado estado) {
        String query = "UPDATE tbestado SET descricao = ? WHERE sigla = ?";

        try {
            Connection connection = ConexaoDB.getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, estado.getDescricao());
            stmt.setString(2, estado.getSigla());
            stmt.executeUpdate();

            stmt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar estado: "+e.getMessage());
        }

        return false;
    }

    public boolean deletarEstado(String sigla){
        String query = "DELETE FROM tbestado WHERE sigla = ?";

        try {
            Connection connection = ConexaoDB.getConnection();
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setString(1, sigla);
            stmt.executeUpdate();
            connection.close();
            stmt.close();
            System.out.println("Estado deletado com sucesso");

            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar: "+e.getMessage());
            return false;
        }
    }
}