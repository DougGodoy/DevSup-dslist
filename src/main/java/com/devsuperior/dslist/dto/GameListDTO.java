package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

    private long id;
    private String name;

    public GameListDTO (){
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
        //poderia ter usado o  BeanUtils.copyProperties(entity, this);
        // mas vai precisar dos getters e setters, como não usamos vai so os getters


    }
}
