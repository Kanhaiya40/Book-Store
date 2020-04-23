package com.spring.swagger.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
@ToString
@NoArgsConstructor
public class Book{
    @Id
    @JsonProperty("Book_Id")
    private int bookId;
    @JsonProperty("Book_Name")
    private String bookName;
    @JsonProperty("Price")
    private int price;
    @JsonProperty("No_Of_Page")
    private int noOfPage;
}
