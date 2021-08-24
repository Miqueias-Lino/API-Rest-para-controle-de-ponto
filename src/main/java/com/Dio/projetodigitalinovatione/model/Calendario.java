package com.Dio.projetodigitalinovatione.model;

import lombok.*;
import org.hibernate.envers.Audited;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Audited
public class Calendario {

    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecifica;
}
