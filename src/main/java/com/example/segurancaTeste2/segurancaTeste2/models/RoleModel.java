package com.example.segurancaTeste2.segurancaTeste2.models;

import com.example.segurancaTeste2.segurancaTeste2.enums.RoleName;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_role")
public class RoleModel implements GrantedAuthority, Serializable {

    @Serial
    private static final long serialVersionUID = -386360860495765588L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID roleId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleName roleName;

    @Override
    public String getAuthority() {
        return this.roleName.toString();
    }

    public UUID getRoleId() {
        return roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }

    public RoleModel(UUID roleId, RoleName roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public RoleModel() {

    }
}
