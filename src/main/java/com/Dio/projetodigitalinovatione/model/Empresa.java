package com.Dio.projetodigitalinovatione.model;

import lombok.*;
import org.hibernate.envers.Audited;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Audited
public class Empresa {

    private long id;
    private String descricao;
    private String cnpj;
    private String endereço;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

}
