package me.dio.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "tb_news")
public class News extends BaseItem {

}