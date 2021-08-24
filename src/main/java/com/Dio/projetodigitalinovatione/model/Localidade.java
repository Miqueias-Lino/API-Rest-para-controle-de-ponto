package com.Dio.projetodigitalinovatione.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Audited
public class Localidade {

    private long id;
@ManyToOne
private NivelAcesso nivelAcesso;
private String descricao;
}
