package com.projetoESII.projetoESII.dto;

public record UsuarioRequestDTO(String nome, String cpf, String senha, boolean statusConfirmado, boolean isAdm, String email) {

}