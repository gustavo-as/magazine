package br.com.gustavosimoes.magazine.generic;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public class GenericModel implements Serializable {
    private static final long serialVersionUID = 4639613039341293737L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
