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
public class Ocorrencia {

    private long id;
    private String nome;
    private String descricao;

}
