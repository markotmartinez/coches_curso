package com.project.coches.persistance.mapper;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {


        /**
         * Convierte una entidad a un pojo de marca coche
         * @param marcaEntity Entidad a convertir
         * @return Pojo convertido
         */

        @Mapping(source = "id", target = "id")
        @Mapping(source = "description", target = "description")
        MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaEntity);

        /**
         * Convierte un  pojo a un entidad de marca coche
         * @param marcaPojo Pojo a convertir
         * @return Entity convertido
         */

        @InheritInverseConfiguration
        MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaPojo);

        /**
         * retorna una lista de marcas coche transfomada a pojo de una lista de entidades
         * @param marcasCocheEntity Entidad a transformar
         * @return Lista transformada
         */

        List<MarcaCochePojo> toMarcasCochePojo(List<MarcaCocheEntity> marcasCocheEntity);


}
