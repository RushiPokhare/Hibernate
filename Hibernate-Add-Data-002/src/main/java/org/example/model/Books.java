package org.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table(name = "Books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @ElementCollection
    @CollectionTable(name = "Book_Modes",joinColumns =@JoinColumn(name = "book_id") ) // @CollectionTable(name = "Book_Modes")-->for customizing collection table name &  joinColumns =@JoinColumn(name = "book_id")--> used for to change the name of foreign key column
    private List<String> bookmodes =new ArrayList<>();
}
