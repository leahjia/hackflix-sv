package dev.leah.hacks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// Each Document in the Hacks collection
@Document (collection = "hacks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hack {
  @Id
  private ObjectId id;
  private String hackId;
  private String title;
  private String founded;
  private String youtubeLink;
  private List<String> genres;
  private String poster;
  private List<String> backdrops;
  @DocumentReference
  private List<Review> reviewIds;
}
