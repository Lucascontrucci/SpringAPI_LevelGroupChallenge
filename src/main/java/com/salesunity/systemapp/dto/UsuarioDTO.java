package com.salesunity.systemapp.dto;


import com.salesunity.systemapp.model.Pedido;
import com.salesunity.systemapp.model.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class UsuarioDTO {

    private Long id;

    private String name;

    private String email;

    private String senha;

    private boolean admin;

    private Long empresa_id;

    private List<Long> compras_id;

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.name = usuario.getName();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.admin = usuario.isAdmin();
        this.empresa_id = usuario.getEmpresa().getId();
        this.compras_id = usuario.getCompras().stream().map(Pedido::getId).toList();
    }
}
